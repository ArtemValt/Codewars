package com.codewars.sixkuy;

import java.util.Arrays;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int sumCh = 0;
        int count = 0;

        char[] ch = text.toLowerCase().toCharArray();
        Arrays.sort(ch);
        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] == ch[i]) {
                if (sumCh == 0) {
                    count = count + 1;
                    sumCh = sumCh + 1;
                }
            } else
                sumCh = 0;
        }
        return count;
    }
}