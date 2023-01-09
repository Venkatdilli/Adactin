package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	static Scenario sc;
	@Before
	public void beforeScenario(Scenario scenario) throws FileNotFoundException, IOException {
		getdriver(getPropertyFileValue("browser"));
		launchUrl(getPropertyFileValue("url"));
sc=scenario;
	}

	@After
	public void afterScenario(Scenario s) {
		

			s.attach(screenshot(), s.getName() + ".png", "Dilli");
			
		
		driver.quit();

	}
}
