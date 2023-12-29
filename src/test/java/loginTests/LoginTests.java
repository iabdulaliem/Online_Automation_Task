package loginTests;
import baseTest.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {


    @Test(priority = 1)
    public void successfulLogin() {


        driver.findElement(By.xpath("//a[contains(text(),\"Form Authentication\")]")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        String expectedResult = "You logged into a secure area!";
        String actualResult = driver.findElement(By.id("flash")).getText();
        assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 2)
    public void wrongUsername() {
        driver.findElement(By.xpath("//a[contains(text(),\"Form Authentication\")]")).click();
        driver.findElement(By.id("username")).sendKeys("wrongUsername");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        String expectedResult = "Your username is invalid!";
        String actualResult = driver.findElement(By.id("flash")).getText();
        assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 3)
    public void wrongPassword() {
        driver.findElement(By.xpath("//a[contains(text(),\"Form Authentication\")]")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("wrongpassword");
        driver.findElement(By.className("radius")).click();
        String expectedResult = "Your password is invalid!";
        String actualResult = driver.findElement(By.id("flash")).getText();
        assertTrue(actualResult.contains(expectedResult));
    }
}