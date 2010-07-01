package sugar.should;

import static junit.framework.Assert.assertEquals;

public class IntShould {
    private int actual;

    public IntShould(int actual) {
        this.actual = actual;
    }

    public void be(int expected) {
        assertEquals(expected, actual);
        
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
}
