package jassert;

import static junit.framework.Assert.assertEquals;

public class jAssertMatcher<T> {



    public Should<T> should = new Should<T>();
    public ShouldNot<T> should_not = new ShouldNot<T>();

    public jAssertMatcher(T actual) {
        should.setActual(actual);
        should_not.setActual(actual);
    }



}
