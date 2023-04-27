package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import time;

import java.time.Duration;

public class Test1 {

    private static WebDriver driver;


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.winner.bg/");
        System.out.println(driver.getTitle());

        WebElement cookie = driver.findElement(By.id("spd-submit"));
        cookie.click();


        WebElement enter = driver.findElement(By.className("user-imgholder"));
        enter.click();

        WebElement username1 = driver.findElement(By.name("username"));
        username1.sendKeys("georgi01");

        WebElement password1 = driver.findElement(By.name("password"));
        password1.sendKeys("georgi-georgi");


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement login = driver.findElement(By.className("right"));
        login.click();

        WebElement profile = driver.findElement(By.className("user-imgholder"));
        profile.click();

        WebElement post = driver.findElement(By.linkText("Поща"));
        post.click();
//        driver.get("https://www.winner.bg/user/messages");

        WebElement writeMessage = driver.findElement(By.className("wrote_messege"));
        writeMessage.click();

        WebElement recipient = driver.findElement(By.id("users"));
        recipient.sendKeys("georgi01");
//  SoftAssert softAssert = new SoftAssert();
//  softAssert.assertEquals(recipient.getText(),"georgi01","Incorrect recipient!");

WebElement title = driver.findElement(By.name("subject"));
title.sendKeys("Testing");

WebElement text = driver.findElement(By.name("text"));
text.sendKeys("This email should be visible");
//time.sleep(2);

WebElement send = driver.findElement(By.className("send-button"));
send.click();

   WebElement mailIcon1 = driver.findElement(By.className("mail_icon"));
   mailIcon1.click();
//        Assert.isTrue();
    }


//        driver.close();
        }


