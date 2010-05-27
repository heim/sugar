package jassert;

import org.junit.Test;

import static jassert.Ensurer.and;
import static jassert.Ensurer.then;


public class SyntaxTest {

    @Test
    public void testEnsureTrue() {
        String val = "hei";




        then(val).should.be("hei");



        and(val).should_not.be("heim");



    }


    @Test
    public void testContainsWithObjects() throws Exception {
        String[] ary = {"1", "2", "3", "4", "5", "6"};

        then(ary).should.contain("6");
        then(ary).should_not.contain("8");
    }


    @Test
    public void testContainsWithPrimitiveInt() throws Exception {
        int[] ary = {1, 2, 3, 4, 5, 6};

        then(ary).should.contain(6);
        then(ary).should_not.contain(8);
    }


}



