package forgetPassword;

import baseTest.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgetPasswordTests extends BaseTests {


    @Test
    public void testForgetPassword() {


        driver.findElement(By.xpath("//a[contains(text(),\"Forgot Password\")]")).click();
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("iabdulaliem@gmail.com");
        driver.findElement(By.xpath("//button[@id=\"form_submit\"]")).click();
        String expectedResult = "Internal Server Error";
        //Stucked in the below locator
        String actualResult = driver.findElement(By.cssSelector("body > h1")).getText();
        assertTrue(actualResult.contains(expectedResult));

    }
}
