package com.test;

import java.util.List;
import java.util.Set;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtocart {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("redmi 11");
        searchBox.submit();

        String mainPage = driver.getWindowHandle(); //current page id (main page)
        

        driver.findElement(By.xpath("//div[@class='_4WELSP']/img[@alt='REDMI Note 11 (Horizon Blue, 64 GB)' and contains(@src, 'imaggghwgnzxzzvm')]")).click();

        Set<String> allPages=driver.getWindowHandles(); //multiple window handles
        for(String page : allPages) {
            if(!page.equals(mainPage)) {
                driver.switchTo().window(page);
                break;
            }
        }

        //add to cart
        driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
    }

}
