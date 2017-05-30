package com.epam.tlmd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	 private WebDriver driver;
	 private final String BASE_URL = "http://www.telemundo.com/";

	public MainPage(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(this.driver, this);
	}
	
	public void openPage() {
	    driver.navigate().to(BASE_URL);
	}
	
	public boolean checkTitle(){
		String title = driver.getTitle();
		if (title.contains("Telemundo")){
			return true;
		}
		else{
			return false;
		}
	}
}
