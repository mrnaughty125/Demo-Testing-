package com.test;

import java.util.List;
import java.util.Set;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;


public class Checkdelivery {

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

        WebElement pincode = driver.findElement(By.xpath("//input[@class='AFOXgu']"));
        pincode.sendKeys("531031");

        WebElement check = driver.findElement(By.xpath("//span[@class='i40dM4']"));
        check.click();

        //add to cart
        //driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();

        WebElement deliveryElement = null;
        try {
            deliveryElement = driver.findElement(By.xpath("//div[@class='hVvnXm' and contains(., 'Delivery')]"));
        } catch (NoSuchElementException e) {
            // Delivery element is not found 
            System.out.println("No delivery available, exiting...");
            driver.quit();
            
            return;
        }

           // Delivery element is found then add to cart
        if (deliveryElement != null) {
            System.out.println(deliveryElement);
            System.out.println("Adding to cart...");
            driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
        }

    }

}
