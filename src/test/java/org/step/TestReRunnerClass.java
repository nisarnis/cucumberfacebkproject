package org.step;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilites.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Rerun\\failed.txt",glue="org.step",dryRun=false,snippets=SnippetType.CAMELCASE,
plugin= {"json:target\\Reports\\fbpage.json","rerun:src\\test\\resources\\Rerun\\failed.txt"})

public class TestReRunnerClass {
	@AfterClass
	public static void reportPull() {
		JVMReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\fbpage.json");
	}

}
