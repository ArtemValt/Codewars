package com.codewars.sixkuy;

public  class ConsonantValue {
    public static int solve(final String s) {
        char[] ch = s.toCharArray();
        int sumword = 0;
        int sumword2 = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                if (sumword > sumword2)
                    sumword2 = sumword;
                sumword = 0;
            } else
                sumword += (int) ch[i] - 96;
        }
        if (sumword > sumword2)
            return sumword;
        else
            return sumword2;

    }
}