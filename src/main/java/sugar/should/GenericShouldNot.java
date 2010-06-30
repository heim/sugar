package sugar.should;


import static junit.framework.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class GenericShouldNot<A>  {
    private A actual;
    private boolean invert = false;


    public GenericShouldNot<A> also = this;
    public GenericShouldNot<A> either = this;


    public void be(A expected) {
        assertThat(expected, not(equalTo(actual)));
    }

    public void setActual(A actual) {
        this.actual = actual;
    }

}
