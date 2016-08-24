package com.assignmentnine;

import org.bitbucket.bradleysmithllc.etlunit.TestResults;
import org.bitbucket.bradleysmithllc.etlunit.feature.FeatureModule;
import org.bitbucket.bradleysmithllc.etlunit.feature.Feature;
import org.bitbucket.bradleysmithllc.etlunit.feature.AbstractFeature;
import org.bitbucket.bradleysmithllc.etlunit.test_support.BaseFeatureModuleTest;

import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

import java.io.IOException;

public class hiyaTest extends BaseFeatureModuleTest {
	public List<Feature> getTestFeatures()
	{
		return Arrays.asList((Feature) new hiya());
	}

	public boolean echoLog()
	{
		return false;
	}

	public void setUpSourceFiles() throws IOException
	{
		createSource("test.etlunit", "class test { @Test test_me() {test(option: \"NiceValue\");}}");
	}

	@Test
	public void test()
	{
		TestResults result = startTest();

		Assert.assertEquals(1, result.getNumTestsSelected());
		Assert.assertEquals(1, result.getMetrics().getNumberOfTestsPassed());
		Assert.assertEquals(0, result.getMetrics().getNumberOfAssertionFailures());
		Assert.assertEquals(0, result.getMetrics().getNumberOfWarnings());
		Assert.assertEquals(0, result.getMetrics().getNumberOfErrors());
	}
}