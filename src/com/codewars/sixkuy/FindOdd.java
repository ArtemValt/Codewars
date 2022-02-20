package com.codewars.sixkuy;

public class FindOdd {
    public static int findIt(int[] a) {
        int odd = 0;
        if (a.length == 1)
            return a[0];
        else {
            for (int i = 1; i < a.length; i++) {
                int count = 0;

                for (int j = 0; j < a.length; j++) {
                    if (a[i] == a[j])
                        count++;
                }
                if (count % 2 == 1)
                    odd = a[i];

            }
        }
        return odd;
    }
}