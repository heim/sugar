package jassert;

import static junit.framework.Assert.assertEquals;

public class Should<T> {
    private T actual;

    public <T> void be(T expected) {
        assertEquals("values should be equal", expected, actual);
    }

    public void setActual(T actual) {
        this.actual = actual;
    }
}
