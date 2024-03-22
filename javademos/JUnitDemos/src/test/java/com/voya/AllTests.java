package com.voya;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.voya.testcases.CalculatorTest;
import com.voya.testcases.trial.Checker;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.voya"})
//@ExcludePackages({"com.voya.testcases.trial"})
@SuiteClasses({CalculatorTest.class})
@IncludeTags({"first"})
public class AllTests {

}
