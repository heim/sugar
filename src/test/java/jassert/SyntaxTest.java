package jassert;

import org.junit.Test;


public class SyntaxTest {

    @Test
    public void testEnsureTrue() {
        boolean val = true;

       ensure(val).is(true);


    }


}



