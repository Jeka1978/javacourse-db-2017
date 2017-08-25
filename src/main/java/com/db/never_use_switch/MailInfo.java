package com.db.never_use_switch;

import com.db.heroes.DataFactoryHolder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static com.db.heroes.DataFactoryHolder.getInstance;

/**
 * Created by Evegeny on 24/08/2017.
 */
@Data
@RequiredArgsConstructor
public class MailInfo {
    private ClientData clientData = ClientData.builder().
            clientName(getInstance().getDataFactory().getFirstName()).
            email(getInstance().getDataFactory().getEmailAddress())
            .build();
    private final int mailCode;

}
