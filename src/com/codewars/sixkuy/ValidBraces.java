package com.codewars.sixkuy;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidBraces {
    static Stack<Character> stack = new Stack<>();
    static final List<Character> OPEN_BRACKETS = Arrays.asList('(', '{', '[');
    static final List<Character> CLOSING_BRACKETS = Arrays.asList(')', '}', ']');

    public boolean isValid(String braces) {
        char[] textChar = braces.toCharArray();
        for (int i = 0; i < textChar.length; i++) {
            if (OPEN_BRACKETS.contains(textChar[i]))
                stack.push(textChar[i]);
            else {
                if (CLOSING_BRACKETS.contains(textChar[i])) {
                    if (!stack.empty() && stack.peek() == getOpenBracketPair(textChar[i])) {
                        stack.pop();
                    } else {
                        if (stack.empty()) {
                            return false;
                        }
                        char symbol = ' ';
                        while (!stack.empty()) {
                            if (stack.peek() == getOpenBracketPair(textChar[i])) {
                                return false;

                            }
                            symbol = stack.pop();
                        }

                        return false;

                    }
                }
            }
        }
        if (!stack.empty()) {
            return false;

        }
        return true;
    }

    public char getOpenBracketPair(char bracket) {
        return (bracket == '}') ? '{' : (bracket == ')') ? '(' :
                (bracket == ']') ? '[' : '\0';
    }

    public char getClosingBracketPair(char bracket) {
        return (bracket == '{') ? '}' : (bracket == '(') ? ')' :
                (bracket == '[') ? ']' : '\0';
    }
}

