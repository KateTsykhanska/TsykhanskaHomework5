
package org.example;


import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {

            driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
            WebElement sign = driver.findElement(By.xpath("//button[@class='header-link -guest']"));
            Assert.assertTrue("Guest log-in is not displayed", sign.isDisplayed());
            sign.click();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            String currentURL = driver.getCurrentUrl();
            Assert.assertEquals(currentURL, "https://guest:welcome2qauto@qauto.forstudy.space/panel/garage");

            WebElement button1 = driver.findElement(By.xpath("//a[@class='btn btn-white btn-sidebar sidebar_btn -active']"));
            Assert.assertTrue("Button1 is not displayed", button1.isDisplayed());
            System.out.println("Button 1 text:" + button1.getText());

            WebElement button2 = driver.findElement(By.xpath("//a[@class='btn btn-white btn-sidebar sidebar_btn']"));
            Assert.assertTrue("Button2 is not displayed", button2.isDisplayed());
            System.out.println("Button 2 text:" + button2.getText());

            WebElement button3 = driver.findElement(By.xpath("//a[@routerlink=\"instructions\"]"));
            Assert.assertTrue("Button3 is not displayed", button3.isDisplayed());
            System.out.println("Button 3 text:" + button3.getText());

            WebElement button4 = driver.findElement(By.xpath("//a[@class='btn btn-link text-danger btn-sidebar sidebar_btn']"));
            Assert.assertTrue("Button4 is not displayed", button4.isDisplayed());
            System.out.println("Button 4 text:" + button4.getText());
        } finally {

            driver.quit();
        }
    }
}
