package com.stackroute.PE4;
import java.util.ArrayList;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MultipleOccurrencesOfWord {
        public int[] MultipleOccurrenceOfAPattern(String str, String s)
        {
            Pattern pattern = Pattern.compile(s);
            Matcher matcher = pattern.matcher(str);

            int i=0,j=1;
            int[] arr=new int[6];
            while (matcher.find()) {
                arr[i]=matcher.start();
                arr[j]=matcher.end();
                i=i+2;
                j=j+2;

            }

         return arr;
        }
    }

