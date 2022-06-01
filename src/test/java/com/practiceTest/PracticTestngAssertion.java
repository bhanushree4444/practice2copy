package com.practiceTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PracticTestngAssertion {

	SoftAssert asrt=new SoftAssert();
	
	@Test 
	public  void Test1Test() {
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		Reporter.log(browser,true);
		Reporter.log(url,true);
		Reporter.log("a------>",true);
		asrt.assertEquals("abc", "ac");
		Reporter.log("b------>",true);
		asrt.fail();
		Reporter.log("c------>",true);
		Reporter.log("d------>",true);
		asrt.assertAll();
		Reporter.log("hi----->", true);
		
	}
	
	@Test 
	public  void Test2Test() {
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		Reporter.log(browser,true);
		Reporter.log(url,true);
		Reporter.log("a------>",true);
		asrt.assertEquals("abc", "abc");
		Reporter.log("b------>",true);
		Assert.fail();
		Reporter.log("c------>",true);
		asrt.assertEquals("abc", "abc");
		Reporter.log("d------>",true);
		Reporter.log("hi----->", true);
		Reporter.log(browser,true);
		Reporter.log(url,true);
	}
	
	@Test 
	public  void Test3Test() {
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		Reporter.log(browser,true);
		Reporter.log(url,true);
		Reporter.log("a------>",true);
		asrt.assertEquals("abc", "ab");
		Reporter.log("b------>",true);
		asrt.assertAll();
		Assert.fail();
		Reporter.log("c------>",true);
		Reporter.log("d------>",true);
		asrt.assertAll();
		Reporter.log("hi----->", true);
		Reporter.log(browser,true);
		Reporter.log(url,true);
	}
}
