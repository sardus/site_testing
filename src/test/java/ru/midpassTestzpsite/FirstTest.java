package ru.midpassTestzpsite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings{

    @Test
    public void firstTest() {

        driver.get("https://zp.midpass.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Оформление заявлений о выдаче ПНП"));

    }

}
