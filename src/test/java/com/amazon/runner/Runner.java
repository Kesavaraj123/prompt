package com.amazon.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\amazon\\feature",glue="com\\amazon\\stepdefinition")
public class Runner {

}
