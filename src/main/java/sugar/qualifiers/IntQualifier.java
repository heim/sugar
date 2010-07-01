package sugar.qualifiers;

import sugar.should.IntShould;
import sugar.should.IntShouldNot;

public class IntQualifier {

    public IntShould should;
    public IntShouldNot should_not;

    public IntQualifier(int actual) {
        should = new IntShould(actual);
    }
}
