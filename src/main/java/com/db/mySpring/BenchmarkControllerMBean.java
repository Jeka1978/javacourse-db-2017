package com.db.mySpring;

/**
 * Created by Evegeny on 29/08/2017.
 */
public interface BenchmarkControllerMBean {

    void setEnabled(boolean enabled);

    void killServer(int code);
}
