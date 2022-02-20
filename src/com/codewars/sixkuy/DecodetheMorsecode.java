package com.codewars.sixkuy;

public class DecodetheMorsecode {
        public static String decode(String morseCode) {
            String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                    "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                    "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
                    "9", "0","!", ",", "?", ".", "'","sos"};
            String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                    "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                    "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                    "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
                    "-....", "--...", "---..", "----.", "-----","-.-.--", "--..--", "..--..", ".-.-.-", ".----.","...---..."};

            String build = "";
            String change = morseCode.trim();
            String[] words = change.split("   ");
            for (String word : words) {
                for (String letter : word.split(" ")) {
                    for (int x = 0; x < morse.length; x++) {
                        if (letter.equals(morse[x]))
                            build = build + english[x];
                    }
                }
                build += " ";

            }

            return build.toUpperCase().trim();
        }
    }

