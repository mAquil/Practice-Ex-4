package com.stackroute.Pe4;

import com.stackroute.PE4.TransposeString;
import org.junit.*;
import static org.junit.Assert.*;

public class TransposeStringTest {
        TransposeString obj;

        @Before
        public void setup()
        {
            obj = new TransposeString();
        }

        @After
        public void tearDown()
        {
            obj= null;
        }

        @Test
        public void ReverseWords_StringSentence_ShouldReturnReverseStringOfWords() {
            String str = "my name is khan";
            String expected = "ym eman si nahk";
            String result = obj.ReverseWords(str);
            assertEquals(expected, result);
        }


        @Test
        public void ReverseWords_StringSentence_ShouldReturnReverseStringOfWords1() {
            String str = "this is a good morning";
            String expected = "siht si a doog gninrom";
            String result = obj.ReverseWords(str);
            assertEquals(expected, result);
        }


        }


