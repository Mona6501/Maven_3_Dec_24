package testng;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test (priority = 1)
    public void testCaseZ(){
        System.out.println("Test Case Z");
    }
    @Test (priority = 'c')
    public void testCaseA(){
        System.out.println("Test Case A");
    }
    @Test (priority = 3)
    public void testCaseM(){
        System.out.println("Test Case M");
    }
    @Test (priority = -4)
    public void testCaseG(){
        System.out.println("Test Case G");
    }
    @Test (priority = 5)
    public void testCaseC(){
        System.out.println("Test Case C");
    }
    @Test (priority = -6)
    public void testCaseS(){
        System.out.println("Test Case S");
    }
}
