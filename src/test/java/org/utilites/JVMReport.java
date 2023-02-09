package org.utilites;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJvmReport(String jsonpath) {
	
		//1.Mention the target folder location where u want cucumber report
		File f = new File(System.getProperty("user.dir")+"\\target\\Reports\\Fathima");

		//2.Add details to the report using configuration class
		Configuration con=new Configuration(f,"Fb project");
		con.addClassifications("Browser Name","chrome");
		con.addClassifications("Browser version","102");
		con.addClassifications("OS Name","Windows");
		con.addClassifications("Os Version","11");
		con.addClassifications("Sprint Name","21");
		
		//3.Add json file paths into List<string>
		List<String> li =new ArrayList<String>();
		li.add(jsonpath);
		
		//4.Create Object for ReportBuilder class
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
		}

}
