package Testing;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class Main {

    @Before 
    public void setUp() {

        System.out.println("Before");
    }


    @After 
    public void tearDown() {

        System.out.println("After");

    }

    @Test
    public void test1() {

        System.out.println("Test1");

        assertEquals(C2.subtract(1, 1), 0);

    }

    public static void main(String[] args) {

        org.junit.runner.JUnitCore.main("Main");
        
    }

}
