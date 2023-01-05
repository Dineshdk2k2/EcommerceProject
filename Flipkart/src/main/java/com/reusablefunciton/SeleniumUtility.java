package com.reusablefunciton;

import com.baseclass.Libraryclass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class SeleniumUtility extends Libraryclass{
    public SeleniumUtility (WebDriver driver)
    {
        this.driver=driver;
    }

    public void Title()
    {
        System.out.println(driver.getTitle());
    }

    public void dropdown(WebElement element, String selectvalue) {
        Select select=new Select(element);
        select.selectByValue(selectvalue);

    }

    public void takescreenshot(String path) throws IOException {
        TakesScreenshot ts =(TakesScreenshot)driver;
        File Source =ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(Source,new File(path));

    }

    public void action() {
        WebElement autolink=driver.findElement(By.linkText("Automation Testing"));
        WebElement cou=driver.findElement(By.linkText("Courses"));
        Actions act=new Actions(driver);
        act.moveToElement(autolink).click().perform();
        act.moveToElement(cou).perform();
    }
    public void quit() {
        driver.close();

    }
}
