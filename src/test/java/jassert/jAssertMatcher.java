package jassert;

import static junit.framework.Assert.assertEquals;

public class jAssertMatcher<T> {

    private T subject;

    public jAssertMatcher(T subject) {
        this.subject = subject;
    }

    public void is(T value) {
        assertEquals(value, subject);
    }


}
