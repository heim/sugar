package sugar.should;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

public class GenericShould<A> {
    protected A actual;

    public <A> void be(A expected) {
        assertEquals("values should be be", expected, actual);
    }

    public void setActual(A actual) {
        this.actual = actual;
    }
}
