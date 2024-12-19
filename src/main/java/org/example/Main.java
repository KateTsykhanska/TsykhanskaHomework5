package org.example;


import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.awt.*;
import java.security.spec.ECField;
import java.time.Duration;

public class Main {
    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        try {
            WebElement logo = driver.findElement(By.xpath("//a[@class=\"header_logo1\"]"));
            Assert.assertTrue("Logo is not displayed", logo.isDisplayed());
            System.out.println("Logo is displayed");
        } catch (Exception e) {
            System.out.println("Logo does not displayed");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        try {
            WebElement signUp = driver.findElement(By.xpath("//button[@class='hero-descriptor_btn btn btn-primary']"));
            String backgroundColorValue = signUp.getCssValue("background-color");
            String actualColor = rgbaToHex(backgroundColorValue);

            Assert.assertEquals("Background color of Sign up button is correct", "#0275D8", actualColor);
            System.out.println("Background color of Sign up button is correct");
        } catch (Exception e) {
            System.out.println("Background color of Sign up button is incorrect");
        } finally {
            driver.quit();
        }
    }

    private String rgbaToHex(String rgba) {
        // rgba(2, 117, 216, 1)
        String[] parts = rgba.replace("rgba(", "").replace(")", "").split(", ");
        int r = Integer.parseInt(parts[0]);
        int g = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);
        return String.format("#%02X%02X%02X", r, g, b);
    }

}
