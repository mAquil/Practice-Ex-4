/* 1. Write a java program to count the total number of occurrences of a given character in a string
without using any loop?
For Example- Java is java again java again count number of occurrence of a in the given string */


package com.stackroute.PE4;

public class CountOccurrencesString {

    public int  Count(String str){
        int l,result;
        String n;
        n= str.toLowerCase();
        l=n.length();
        result = n.length() - n.replaceAll("a", "").length(); //replacing occurrence of "a" with "" to count no. of "a
        return result;
    }

}
