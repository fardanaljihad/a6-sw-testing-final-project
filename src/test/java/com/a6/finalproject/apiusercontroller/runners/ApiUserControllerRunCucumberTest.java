package com.a6.finalproject.apiusercontroller.runners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("com.a6.finalproject.apiusercontroller") // Restrict to specific package
@SelectClasspathResource("com/a6/finalproject/api-user-controller/features") // Adjusted to select classpath resource
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "html:test-report/api-user-controller-report.html")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.a6.finalproject.apiusercontroller.steps")
public class ApiUserControllerRunCucumberTest {
}
