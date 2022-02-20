package com.codewars.sixkuy;

import java.util.Arrays;

public class WhereIsMyParent {
    static String findChildren(final String text) {

        String[] str = text.split("");
        Arrays.sort(str);
        Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);

        return String.join("", str);
    }
}
