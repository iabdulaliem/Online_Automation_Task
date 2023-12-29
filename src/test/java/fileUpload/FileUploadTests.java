package fileUpload;

import baseTest.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertTrue;

public class FileUploadTests extends BaseTests {
    File uploadFile;

    @Test
    public void testFileUpload() {
        driver.findElement(By.xpath("//a[contains(text(),\"File Upload\")]")).click();
        WebElement fileUpload = driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
        fileUpload.sendKeys("\"C:\\Users\\Desktop\\selenium.txt\"");
        driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
        String expectedResult = "selenium";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"uploaded-files\"]")).getText();
        assertTrue(actualResult.contains(expectedResult));


    }
}


