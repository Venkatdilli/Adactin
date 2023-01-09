package com.report;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass{
	/**
	 * @see user to genarate report 
	 * @param jsonFile
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void generateJVMReport(String jsonFile) throws FileNotFoundException, IOException {

File file =new File(getProjectPath()+getPropertyFileValue("jvm"));

Configuration config=new Configuration(file,"OMRBranchAdactinAutomation");
config.addClassifications("Browser Name", "Chrome");
config.addClassifications("Browser Version", "107");
config.addClassifications("Os Name", "Win 10");

List<String> jsonFiles = new ArrayList<String>();
jsonFiles.add(jsonFile);
ReportBuilder builder = new ReportBuilder(jsonFiles, config);
builder.generateReports();



	}
	
	

}
