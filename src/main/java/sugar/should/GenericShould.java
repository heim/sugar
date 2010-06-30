package sugar.should;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

public class GenericShould<A> {
    private A actual;
    public GenericShould<A> also = this;

    public <A> void be(A expected) {
        assertEquals("values should be equal", expected, actual);
    }

    public void setActual(A actual) {
        this.actual = actual;
    }
}
