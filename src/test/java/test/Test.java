package test;

import base.Base;

public class Test extends Base{
	
	@org.testng.annotations.Test
	public void test() {
		invokeBrowser();
		System.out.println("Test is executed successfully");
	}

}
