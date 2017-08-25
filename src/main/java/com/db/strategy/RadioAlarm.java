package com.db.strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Delegate;

/**
 * Created by Evegeny on 25/08/2017.
 */
@AllArgsConstructor
@NoArgsConstructor
public class RadioAlarm implements Radio, Alarm {
    @Delegate
    @Setter
    private Radio radio = new RadioImpl();
    @Delegate
    private Alarm alarm = new AlarmImpl();
}
