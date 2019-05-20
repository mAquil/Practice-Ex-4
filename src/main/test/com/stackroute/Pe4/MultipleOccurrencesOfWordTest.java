package com.stackroute.Pe4;

import com.stackroute.PE4.MultipleOccurrencesOfWord;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MultipleOccurrencesOfWordTest {
        MultipleOccurrencesOfWord org;
        @Before
        public void setup()
        {
            org = new MultipleOccurrencesOfWord();
        }

        @After
        public void tearDown()
        {
            org = null;
        }

        @Test
        public void MultipleOccurrenceOfAPattern()
        {
            String str="She sells seashells by the seashore";
            String p="se";
            int[] expected={4,6,10,12,27,29};
            int[] actual=org.MultipleOccurrenceOfAPattern(str,p);
            assertArrayEquals(expected,actual);
            int i=0;
            while (i<6){
                System.out.println("Found at: "+actual[i]+ "-"+actual[i+1]);
                i=i+2;
            }

        }



}



