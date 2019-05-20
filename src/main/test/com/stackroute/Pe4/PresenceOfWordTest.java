package com.stackroute.Pe4;


import com.stackroute.PE4.PresenceOfWord;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PresenceOfWordTest {
    PresenceOfWord obj;

    @Before
    public void setup(){
        obj= new PresenceOfWord();
    }

    @After
    public void tearDown(){
        obj=null;
    }

    @Test
    public void NameMatcher_GivesBoolean_ShouldReturnTrue(){
        String str="This is Harry";
        String name="Harry";
        boolean result=obj.NameMatcher(name,str);
        String condition="Is Harry here? ";
        assertTrue(condition,result);
        System.out.print("Is Harry here? ");
        System.out.println(result);
    }


    @Test
    public void NameMatcher_GivesBoolean_ShouldReturnTrue2(){
        String str="This is Henry";
        String name="Harry";
        boolean result=obj.NameMatcher(name,str);
        String condition="Is Harry here? ";
        assertFalse(condition,result);
        System.out.print("Is Harry here? ");
        System.out.println(result);
    }

}
