package com.Selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashwini\\Desktop\\sel\\chromedriver_win32 (1)\\chromedriver.exe");
             WebDriver driver=new ChromeDriver();
             driver.get("https:/www.gmail.com");
             
             
	}

}
