package com.codewars.sixkuy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GetDay {
    public static String getDay(int day, boolean isLeap) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("LLLL, d");
        LocalDate date = LocalDate.ofYearDay(isLeap ? 2000 : 1999, day);
        return format.format(date);
    }
}