
package com.stackroute.Pe4;

import com.stackroute.PE4.ParagraphToWord;
import org.junit.*;
import static org.junit.Assert.*;

public class ParagraphToWordTest {
    ParagraphToWord obj;

    @Before
    public void setup()
    {
        obj = new ParagraphToWord();
    }

    @After
    public void tearDown()
    {
        obj= null;
    }

    @Test
    public void WordConversion_ArrayOfWords_ShouldReturnStringArray() {
        String str = "my name is khan";
        String[] expected = {"is", "khan", "my", "name"}; //expected output of string array
        String[] result = obj.WordConversion(str);
        assertArrayEquals(expected, result);
    }

    @Test
    public void WordConversion_ArrayOfWords_ShouldReturnStringArray2() {
        String str = "yes you are a fool";
        String[] expected = {"a", "are", "fool", "yes", "you"};    //expected output of string array
        String[] result = obj.WordConversion(str);
        assertArrayEquals(expected, result);
    }

}
