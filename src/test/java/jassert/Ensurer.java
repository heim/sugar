package jassert;

public class Ensurer {

    public static <T> jAssertMatcher<T> then(T val) {
        return new jAssertMatcher<T>(val);
    }

    public static <T> jAssertMatcher<T> and(T val) {
        return new jAssertMatcher<T>(val);
    }
}