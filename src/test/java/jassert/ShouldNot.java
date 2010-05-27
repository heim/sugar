package jassert;


import static junit.framework.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class ShouldNot<A>  {
    private A actual;
    private boolean invert = false;


    public ShouldNot<A> also = this;
    public ShouldNot<A> either = this;
    public Beer be;

    public void be(A expected) {
        assertThat(expected, not(equalTo(actual)));
    }

    public void setActual(A actual) {
        this.actual = actual;
    }

    public <E> void contain(E expected) {
        if(actual.getClass().isArray()) {
            System.out.println(" i am an array ");
            E[] thisActualArray = (E[]) actual;

            for(E element : thisActualArray ) {
                if(element.equals(expected)) {
                    fail("should not contain");
                }
            }
        } else {
            Iterable<A> iactual = (Iterable<A>) actual;

            for(A element : iactual) {
                if(element.equals(expected)) {
                    fail("should not contain");
                }
            }

        }
        
    }
}
