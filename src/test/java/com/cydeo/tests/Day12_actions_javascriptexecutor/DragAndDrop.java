package com.cydeo.tests.Day12_actions_javascriptexecutor;

import com.cydeo.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop {

    @Test
    public void drag_and_drop(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //2. Locate both circles
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

        //Click Accept on cookies
        WebElement acceptCookies = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));

        //Create actions object
        Actions actions = new Actions(Driver.getDriver());

        //3. Drag and drop the small circle to bigger circle.
        //actions.dragAndDrop(smallCircle,bigCircle).perform();

        actions.clickAndHold(smallCircle).pause(2000).moveToElement(bigCircle).pause(3000).release().perform();

        //4. Assert:
        //-Text in big circle changed to: “You did great!”
        String actualtextonbigcircle = bigCircle.getText();
        String expectedtextonbigcircle = "You did great!";

        Assert.assertEquals(actualtextonbigcircle,expectedtextonbigcircle);

    }
}
