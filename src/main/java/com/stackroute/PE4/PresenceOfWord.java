package com.stackroute.PE4;
import java.util.regex.*;

public class PresenceOfWord {
    public boolean NameMatcher(String name, String str){
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(str); //matching name with string

        boolean result = matcher.find();
        return result;
    }

}
