package com.stackroute.Pe4;

import com.stackroute.PE4.CountOccurrencesString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountOccurrencesStringTest {
    CountOccurrencesString obj;

    @Before
    public void setup()
    {
        obj = new CountOccurrencesString();
    }

    @After
    public void tearDown()
    {
        obj= null;
    }

    @Test
    public void placeTest()
    {
        String s1="Hey Tom how was your day today"; //input
        int result=obj.Count(s1);
        int expected =3;
        assertEquals(expected, result);

    }

    @Test
    public void placeTest1()
    {
        String s1="An fdfdSwAAA akjhttfecA"; //input
        int result=obj.Count(s1);
        int expected =6;
        assertEquals(expected, result);

    }

    @Test
    public void placeTest2()
    {
        String s1="Anna is about to go back home"; //input
        int result=obj.Count(s1);
        int expected =4;
        assertEquals(expected, result);

    }


}
