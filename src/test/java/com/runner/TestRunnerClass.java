package com.runner;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.base.BaseClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(tags=(""),dryRun=false,plugin={"pretty","json:target\\Output.json"},features="src\\test\\resources\\Features",glue="com.stepdefinition")
/**
 * 
 * @author Dillibabu
 * @see user should run a project here
 *
 */
public class TestRunnerClass extends BaseClass {
	
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException
	{
		Reporting.generateJVMReport(getProjectPath()+getPropertyFileValue("json"));
		
	}


}
