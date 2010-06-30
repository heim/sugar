package sugar.qualifiers;

import sugar.should.GenericShould;
import sugar.should.GenericShouldNot;


public class GenericQualifier<T> {



    public GenericShould<T> should = new GenericShould<T>();
    public GenericShouldNot<T> should_not = new GenericShouldNot<T>();

    public GenericQualifier(T actual) {
        should.setActual(actual);
        should_not.setActual(actual);
    }



}
