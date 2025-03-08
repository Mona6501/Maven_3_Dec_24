package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void loginFunctionality(){
        Assert.assertTrue( false);
    }

    @Test(dependsOnMethods = "loginFunctionality")
    public void verifyHomePage(){
        System.out.println("Home Page Validation");
    }

    @Test
    public void onboarding(){
        System.out.println("onboarding");
    }
}
