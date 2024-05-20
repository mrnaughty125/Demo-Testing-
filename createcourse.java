package com.test;

import java.util.List;
import java.util.Set;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.swing.*;

public class createcourse {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://release35.learn-dev.auzmor.com/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
        username.sendKeys("padminrelease35@yopmail.com");
        username.submit();

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Test@123");
        password.submit();

        WebElement signin = driver.findElement(By.xpath("//button[@data-testid='login-submit-btn']"));
        signin.click();

        WebElement training= driver.findElement(By.xpath("//div[@class='sc-hRmvpr hDlCmb' and text()=\"Training\"]"));
//        training.click();
        Actions actions= new Actions(driver);
        actions.moveToElement(training).perform();

        WebElement courses= driver.findElement(By.xpath("//*[text()='Courses']"));
        courses.click();

        WebElement createbutton = driver.findElement(By.xpath("//button[@data-testid='create-course']"));
        createbutton.click();

        WebElement createcoursehover = driver.findElement(By.xpath("//*[text()='Quick Course creation']"));
        Actions actionss= new Actions(driver);
        actionss.moveToElement(createcoursehover).perform();

        WebElement createcourse = driver.findElement(By.xpath("//*[text()='Create Course']"));
        createcourse.click();

        WebElement startcreatecourse = driver.findElement(By.xpath("//button[@data-testid='info-create-btn']"));
        startcreatecourse.click();

        WebElement titleofcourse = driver.findElement(By.xpath("//input[@placeholder='Enter title']"));
        titleofcourse.sendKeys("course testing");
        titleofcourse.submit();

        WebElement selectcategories = driver.findElement(By.xpath("//button[@data-testid='category-3205']"));
        selectcategories.click();

        WebElement uploadanimage = driver.findElement(By.xpath("//span[text()='Upload an image']"));
        uploadanimage.click();

        WebElement selectimage = driver.findElement(By.xpath("//div[@class='sc-fjmucm gqichg']"));
        selectimage.click();

        WebElement selectbannerbutton = driver.findElement(By.xpath("//*[text()='Select Banner']"));
        selectbannerbutton.click();


        WebElement saveandcontinuefordetails = driver.findElement(By.xpath("//*[text()='Save and Continue']"));
        saveandcontinuefordetails.click();

        WebElement DescribeYourCourse = driver.findElement(By.xpath("//div[@role='textbox']"));
        DescribeYourCourse.click();
        DescribeYourCourse.sendKeys("hello welcome to describe");

        WebElement Saveandaddlessonsbutton = driver.findElement(By.xpath("//*[text()='Save and Add Lessons']"));
        Saveandaddlessonsbutton.click();

        WebElement Upload_the_content_for_your_lesson = driver.findElement(By.xpath("//span[text()='Upload the content for your lesson']"));
        Upload_the_content_for_your_lesson.click();

        WebElement addlink = driver.findElement(By.xpath("//*[text()='Add Embedded Link']"));
        addlink.click();

        WebElement youtube_link_paste = driver.findElement(By.xpath("//input[@placeholder='Add Your Link Here and Press Enter']"));
        youtube_link_paste.sendKeys("https://www.youtube.com/watch?v=PWk8rWENhNc");
        youtube_link_paste.click();
        youtube_link_paste.sendKeys(Keys.ENTER);

        Thread.sleep(10000); // 10 seconds wait time

        WebElement Savebutton = driver.findElement(By.xpath("//span[text()='Create']"));
        Savebutton.click();

        driver.navigate().back(); // to move into back page

        WebElement saveandcontinueforlessons = driver.findElement(By.xpath("//*[text()='Save and Continue']"));
        saveandcontinueforlessons.click();


//        WebElement startaddingquestions = driver.findElement(By.xpath("//span[text()='Start Adding Questions']"));
//        startaddingquestions.click();
//
//        WebElement dropdownforquestiontype = driver.findElement(By.xpath("//div[@data-testid='question-type-dropdown']"));
//        dropdownforquestiontype.click();
//
//        WebElement multiplechoice = driver.findElement(By.xpath("//span[text()='Multiple Choice']"));
//        multiplechoice.click();
//
//        WebElement multiplechoicequestiontext = driver.findElement(By.xpath("//textarea[@class='sc-kZuyWR fbpfvN']"));
//        multiplechoicequestiontext.sendKeys("my name is");
//
//
//        WebElement multiplechoiceop1 = driver.findElement(By.xpath("//input[@placeholder='Option 1']"));
//        multiplechoiceop1.sendKeys("pradeep");
//        if (!multiplechoiceop1.isSelected()) {
//            // If not selected, click the checkbox to select it
//            multiplechoiceop1.click();
//        }
//
//
//        WebElement multiplechoiceop2 = driver.findElement(By.xpath("//input[@placeholder='Option 2']"));
//        multiplechoiceop2.sendKeys("pradeep kumar");
//        if (!multiplechoiceop2.isSelected()) {
//            // If not selected, click the checkbox to select it
//            multiplechoiceop2.click();
//        }
//
//        WebElement multiplechoiceop3 = driver.findElement(By.xpath("//input[@placeholder='Option 3']"));
//        multiplechoiceop3.sendKeys("ramesh");
//
//        WebElement savequestion = driver.findElement(By.xpath("//span[text()='Save Question']"));
//        savequestion.submit();
//
//        WebElement assessmentcontinue = driver.findElement(By.xpath("//span[text()='Continue']"));
//        assessmentcontinue.submit();

        WebElement examskip = driver.findElement(By.xpath("//span[text()='Skip Assessment']"));
        examskip.click();

        WebElement createcertificatebutton = driver.findElement(By.xpath("//span[text()='Create Certificate'][@class='sc-fBuWsC cmDetO']"));
        createcertificatebutton.click();

        WebElement choosecertificate = driver.findElement(By.xpath("//div[@class='sc-kajnpt iIYJRF']"));
        choosecertificate.click();

        WebElement heading = driver.findElement(By.xpath("//input[@placeholder='Heading']"));
        heading.sendKeys("CERTIFICATE OF COMPLETION");

        WebElement Line1 = driver.findElement(By.xpath("//input[@placeholder='Line 1']"));
        Line1.sendKeys("This is to certify that");

        WebElement Line2 = driver.findElement(By.xpath("//input[@placeholder='Line 2']"));
        Line2.sendKeys("has successfully completed and received a passing grade in");

        WebElement Coursestitle = driver.findElement(By.xpath("//input[@placeholder='Course Title']"));
        Coursestitle.sendKeys("course testing");

        WebElement Authorityname = driver.findElement(By.xpath("//input[@placeholder='Authority Name']"));
        Authorityname.sendKeys("Primary Admin");

        WebElement createcertificate = driver.findElement(By.xpath("//span[text()='Create Certificate'][@class='sc-fBuWsC jqnfjM']"));
        createcertificate.click();

        WebElement saveandexit = driver.findElement(By.xpath("//*[text()='Save and Exit']"));
        saveandexit.click();

    }


}
