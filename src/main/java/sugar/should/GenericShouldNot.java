package sugar.should;


import static org.junit.Assert.*;

public class GenericShouldNot<A> extends GenericShould<A>  {
    @Override
    public <A> void be(A expected) {
        if(expected != null) {
            assertFalse(expected.equals(actual));
        } else {
            if(actual == null) {
                fail("should not be equal");    
            }
        }
    }
}
