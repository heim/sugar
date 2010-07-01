package sugar.qualifiers;

import org.junit.Test;

import static sugar.Then.then;

public class IntQualifierTest {

    @Test
    public void testQualifierShould() {
        int actual = 1;
        IntQualifier iq = new IntQualifier(actual);

        then(iq.should).should_not.be(null);

    }

    

}
