package com.stackroute.PE4;

public class TransposeString {
    public String ReverseWords(String str){
        String words[]=str.split(" ");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" "; //reversing each word
        }
        return reverseWord.trim();

    }
}
