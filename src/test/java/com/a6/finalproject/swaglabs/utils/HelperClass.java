package com.a6.finalproject.swaglabs.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClass {
  private static WebDriver driver;

  public static WebDriver getDriver() 
  {
    if (driver == null) {
      driver = new ChromeDriver();
    }
    return driver;
  }

  public static void closeDriver() 
  {
    if (driver != null) {
      driver.quit();
      driver = null;
    }
  }
}
