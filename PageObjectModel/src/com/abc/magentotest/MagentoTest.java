package com.abc.magentotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoobjects.*;


public class MagentoTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		Welcome w = new Welcome(driver);
		w.clickOnMyAccount();
		
		Login l = new Login(driver);
		l.typeEmailText("narasayyashetty22497@gmail.com");
		l.typePswdText("Narsu@143");
		l.clickOnLogin();
		
		Home h = new Home(driver);
		h.ClickOnLogout();
		
		driver.quit();
		
	}

}
