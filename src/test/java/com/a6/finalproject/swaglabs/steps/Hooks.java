package com.a6.finalproject.swaglabs.steps;

import org.openqa.selenium.WebDriver;

import com.a6.finalproject.swaglabs.utils.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
  public static WebDriver driver;

  @Before
  public void setUp() {
    driver = HelperClass.getDriver();
  }

  @After
  public void tearDown() {
    HelperClass.closeDriver();
  }
}
