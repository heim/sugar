package jassert;

import org.junit.Test;

import static jassert.Ensurer.and;
import static jassert.Ensurer.then;


public class SyntaxTest {

    @Test
    public void testEnsureTrue() {
        boolean val = true;

       then(val).should.be(true);

       and(val).should_not.either.be(true);


    }


    


}



