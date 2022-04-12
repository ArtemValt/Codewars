package com.codewars.Four.Next_bigger_number_with_the_same_digits;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NextGreater {

    static void swap(long[] ar, int i, int j) {
        long temp = ar[(int) i];
        ar[i] = ar[j];
        ar[j] = temp;

    }

    public static long nextBiggerNumber(long n) {

        long[] ar = aVoid(n);
        int i;
        int z = ar.length;
        for (i = (z - 1); i > 0; i--)
            if (ar[i] > ar[i - 1])
                break;
        if (i == 0)
            return -1;
        else {
            int x = (int) ar[(i - 1)], min = i;
            for (int j = i + 1; j < z; j++) {
                if (ar[j] > x && ar[j] < ar[min])
                    min = j;
            }
            swap(ar, i - 1, (int) min);
            Arrays.sort(ar, i, z);
            Long a = arrayToLong(ar);
            return a;
        }
    }

    public static long[] aVoid(long number) {
        int len = String.valueOf(Math.abs(number)).length();//Узнать длинну числа (будет 8)
        long temp_number = number;//создать переменную для теста
        long[] a1 = new long[len];//создать массив с длинной указанной в len
        for (int i = len - 1; i > -1; i--) {//заполнить массив с конца
            a1[i] = temp_number % 10;//присвоить остаток от деления этому числу
            temp_number /= 10;//разделить число на 10 что бы дальше считать остатки от деления
        }
        return a1;
    }

    public static long arrayToLong(long[] arr) {
        String s = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining());
        return Long.parseLong(s); //parse integer out of the string
    }

}


