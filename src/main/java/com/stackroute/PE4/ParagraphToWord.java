package com.stackroute.PE4;
import java.util.*;

public class ParagraphToWord {
    public String[] WordConversion(String str){
        String[] words=str.split(" ");
        int l=words.length;
        String temp="";

        for (int i = 0; i < l; i++)
        {
            for (int j = i + 1; j < l; j++)
            {
                if (words[i].compareTo(words[j])>0) //comparing the words to sort them
                {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
       return words;


    }

}
