package sugar;

import sugar.qualifiers.GenericQualifier;
import sugar.qualifiers.IntQualifier;

public class Then {

    public static <T> GenericQualifier<T> then(T val) {
        return new GenericQualifier<T>(val);
    }

    public static <T> GenericQualifier<T> and(T val) {
        return then(val);
    }

    public static IntQualifier then(int val) {
        return new IntQualifier(val);
    }
}