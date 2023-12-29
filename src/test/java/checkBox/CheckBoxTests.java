package checkBox;

import baseTest.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CheckBoxTests extends BaseTests {

    @Test
    public void testCheckBox() {


        driver.findElement(By.xpath("//a[contains(text(),\"Checkboxes\")]")).click();
        driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]")).click();
        driver.findElement(By.xpath("//input[@type=\"checkbox\"][2]")).click();
    }
}
