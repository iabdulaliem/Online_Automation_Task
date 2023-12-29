package statusCode;

import baseTest.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class StatusCodeTests extends BaseTests {


    @Test
    public void statusCode200() {


        driver.findElement(By.xpath("//a[contains(text(),\"Status Codes\")]")).click();
        driver.findElement(By.xpath("//a[contains(text(),\"200\")]")).click();
        String expectedResult = "This page returned a 200 status code.";
        String actualResult = driver.findElement(By.xpath("//*[contains(text(),\"This page returned a 200 status code.\")]")).getText();
        assertTrue(actualResult.contains(expectedResult));

}
@Test
    public void statusCode301() {


        driver.findElement(By.xpath("//a[contains(text(),\"Status Codes\")]")).click();
        driver.findElement(By.xpath("//a[contains(text(),\"301\")]")).click();
        String expectedResult = "This page returned a 301 status code.";
        String actualResult = driver.findElement(By.xpath("//*[contains(text(),\"This page returned a 301 status code.\")]")).getText();
        assertTrue(actualResult.contains(expectedResult));

    }
    @Test
    public void statusCode404() {


        driver.findElement(By.xpath("//a[contains(text(),\"Status Codes\")]")).click();
        driver.findElement(By.xpath("//a[contains(text(),\"404\")]")).click();
        String expectedResult = "This page returned a 404 status code.";
        String actualResult = driver.findElement(By.xpath("//*[contains(text(),\"This page returned a 404 status code.\")]")).getText();
        assertTrue(actualResult.contains(expectedResult));

    }
    @Test
    public void statusCode500() {


        driver.findElement(By.xpath("//a[contains(text(),\"Status Codes\")]")).click();
        driver.findElement(By.xpath("//a[contains(text(),\"500\")]")).click();
        String expectedResult = "This page returned a 500 status code.";
        String actualResult = driver.findElement(By.xpath("//*[contains(text(),\"This page returned a 500 status code.\")]")).getText();
        assertTrue(actualResult.contains(expectedResult));

    }


}
