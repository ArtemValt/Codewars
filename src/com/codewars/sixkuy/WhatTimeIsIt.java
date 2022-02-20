package com.codewars.sixkuy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WhatTimeIsIt {
    public static String whatTimeIsIt(final double angle) {
        int hours = 0;
        double minutes = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        Calendar now = Calendar.getInstance();
        if (angle > 360)
            return "angle out";
        if (angle == 0) {
            System.out.print("12:00");
            return "12:00";
        }
        else {
            minutes = angle * 2;
            hours = (int) minutes / 60;
            minutes %= 60;
            while (minutes >= 60) {
                hours++;
                minutes -= 60;
            }
            now.set(Calendar.HOUR, hours);
            now.set(Calendar.MINUTE, (int) minutes);
            System.out.println(sdf.format(now.getTime()));
            System.out.println(("Hours:" + hours + "\n" + "Minutes:" + minutes));
        }
        return sdf.format(now.getTime());
    }
}