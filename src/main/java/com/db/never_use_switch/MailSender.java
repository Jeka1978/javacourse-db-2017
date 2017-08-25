package com.db.never_use_switch;

import com.db.tdd.RunThisMethod;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Created by Evegeny on 24/08/2017.
 */
public class MailSender {

    private Map<Integer, MailGenerator> map = new HashMap<>();


    @SneakyThrows
    public MailSender() {
        Reflections reflections = new Reflections("com.db");
        Set<Class<? extends MailGenerator>> classes = reflections.getSubTypesOf(MailGenerator.class);
        for (Class<? extends MailGenerator> generatorClass : classes) {
            if (!Modifier.isAbstract(generatorClass.getModifiers())) {
                MailCode annotation = generatorClass.getAnnotation(MailCode.class);
                if (annotation == null) {
                    throw new IllegalStateException(MailCode.class.getName() + " is mandatory on each class which implements " + MailGenerator.class.getName());
                }
                int value = annotation.value();
                if (map.containsKey(value)) {
                    throw new RuntimeException(value + " already in use");
                }
                map.put(value, generatorClass.newInstance());
            }
        }
    }

    public void sendMail(MailInfo mailInfo){
        int mailCode = mailInfo.getMailCode();
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailCode + " not supported yet");
        }

        String html = mailGenerator.generateHtml(mailInfo);
        send(html,mailInfo);

    }

    private void send(String html, MailInfo mailInfo) {
        System.out.println("sending... to "+mailInfo.getClientData().getEmail());
        System.out.println("html = " + html);
    }
}
