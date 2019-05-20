package com.stackroute.PE4;

public class ReplaceString {

    public String ReplaceStringCharacter(String str) {
        String s = str.toLowerCase();
        String replace1 = s.replace('d', 'f'); //replacing 'd' with 'f'
        String replace2= replace1.replace('l','t');  //replacing 'l' with 't'
        return replace2;
    }
}
