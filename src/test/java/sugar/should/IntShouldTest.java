package sugar.should;

import junit.framework.AssertionFailedError;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.fail;

public class IntShouldTest {
    IntShould should;
    int actual = 1;
    @Before
    public void setUp() {

        should = new IntShould(actual);
    }

    @Test
    public void testEquals() {

        should.be(actual);
    }

    @Test
    public void testEqualFails() throws Exception {
        boolean failed = true;
        try{
            should.be(actual + 1);
            failed = false;
        } catch(AssertionError r) {
            System.out.println("caught error = ");
        }
        if(!failed) fail("Should fail");

    }
}
