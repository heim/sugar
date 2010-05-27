package jassert;

public class Ensurer {

    public static <T> jAssertMatcher then(T val) {
        return new jAssertMatcher<T>(val);
    }

    public static <T> jAssertMatcher and(T val) {
        return new jAssertMatcher<T>(val);
    }
}