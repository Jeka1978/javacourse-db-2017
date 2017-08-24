package com.db.date_time;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Evegeny on 24/08/2017.
 */
public class DateService {


    //String dateStr = 2017/28/03T12:04:50.126
    public static String max(Date oldDate, LocalDateTime jsr310Date, DateTime jodaDate, String dateStr) {
        List<Date> dates = new ArrayList<>();
        dates.add(oldDate);
        dates.add( Date.from(jsr310Date.atZone(ZoneId.systemDefault()).toInstant()));
        dates.add(jodaDate.toDate());
        dates.add(DateTime.parse(dateStr, DateTimeFormat.forPattern("yyyy/dd/MM/THH:mm:ss")).toDate());
        dates.sort(Date::compareTo);
        Date date = dates.get(0);
        Format formatter = new SimpleDateFormat("yyyy/dd/MM/THH:mm:ss");
        return formatter.format(date);
    }
}















