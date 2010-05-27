package jassert;


import static junit.framework.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class ShouldNot<T> {
    private T actual;


    public ShouldNot<T> also = this;
    public ShouldNot<T> either = this;
    
    public void be(T expected) {
        assertThat(expected, not(equalTo(actual)));
    }

    public void setActual(T actual) {
        this.actual = actual;
    }
}
