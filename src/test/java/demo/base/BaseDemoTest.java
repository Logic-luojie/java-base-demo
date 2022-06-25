package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void sum_test(){
        BaseDemo baseDemo = new BaseDemo();

        assertEquals(3,baseDemo.sum(1,2));
        assertEquals(500,baseDemo.sum(100,200));
    }
}
