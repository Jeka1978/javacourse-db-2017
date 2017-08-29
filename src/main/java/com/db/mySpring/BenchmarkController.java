package com.db.mySpring;

import lombok.Data;
import lombok.SneakyThrows;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Created by Evegeny on 29/08/2017.
 */
@Data
public class BenchmarkController implements BenchmarkControllerMBean {
    private boolean enabled;

    @Override
    public void killServer(int code){
        for (int i = 0; i < code; i++) {
            System.out.println("Надо бы пойти пообедать....");
        }
        System.exit(code);
    }

    @SneakyThrows
    public BenchmarkController() {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        mBeanServer.registerMBean(this, new ObjectName("DB Mbeans", "name", "benchmark"));
    }
}
