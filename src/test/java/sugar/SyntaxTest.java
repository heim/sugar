package sugar;

import org.junit.Test;

import static sugar.Then.and;
import static sugar.Then.then;


public class SyntaxTest {

    @Test
    public void shouldBe() {
        String val = "hei";
        then(val).should.be("hei");
        and(val).should_not.be("heim");
    }


    @Test
    public void shouldEqual() throws Exception {


    }
}



