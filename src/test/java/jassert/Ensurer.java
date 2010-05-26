package jassert;

public class Ensurer {

    public static jAssertMatcher ensure(Object val) {
        Class c = val.getClass();
        return new jAssertMatcher<>(val);
    }
}