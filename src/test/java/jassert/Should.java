package jassert;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

public class Should<A> {
    private A actual;
    public Should<A> also = this;

    public <A> void be(A expected) {
        assertEquals("values should be equal", expected, actual);
    }

    public void setActual(A actual) {
        this.actual = actual;
    }

    public <E> void contain(E expected) {

        System.out.println("expected.getClass() = " + expected.getClass());
        System.out.println("actual.getClass() = " + actual.getClass());
        System.out.println("actual.getClass().isPrimitive() = " + actual.getClass().isPrimitive());


        if(actual.getClass().isArray()) {
            System.out.println(" i am an array ");
            E[] thisActualArray = (E[]) actual;

            for(E element : thisActualArray ) {
                if(element.equals(expected)) {
                    return;
                }
            }
        } else {
            Iterable<A> iactual = (Iterable<A>) actual;

            for(A element : iactual) {
                if(element.equals(expected)) {
                    return;
                }
            }

        }
        fail("did not contain shit");

    }
}
