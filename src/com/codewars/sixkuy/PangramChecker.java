package com.codewars.sixkuy;

public class PangramChecker {
    public boolean check(String sentence){
    sentence = sentence.toLowerCase();
    boolean baba = true;
    for (char ch = 'a'; ch <= 'z'; ch++) {
        if(!sentence.contains(String.valueOf(ch))){
            baba = false;
            break;
        }
    }
    if (baba)
        return true ;
    else
        return false ;
}
}