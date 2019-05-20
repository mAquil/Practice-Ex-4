package com.stackroute.Pe4;

import com.stackroute.PE4.ReplaceString;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReplaceStringTest {
    ReplaceString obj;

    @Before
    public void setup(){
        obj=new ReplaceString();
    }

    @After
    public void tearDown(){
        obj=null;
    }

    @Test
    public void ReplaceStringCharacter_EditedCharacters_ShouldReturnString(){
        String result=obj.ReplaceStringCharacter("daily dry");
        String expected="faity fry";
        assertEquals(expected, result);
    }
}
