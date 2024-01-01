package com.qa.OrangeHRM;

import org.testng.annotations.Test;

public class OrangeHRM {
	
	
	@Test(priority =0)
  public void login() {
		System.out.println("Login is sucess");

  }
@Test(priority  =1)
  public void VerifyLogin() {
	System.out.println("verification is sucess");
	}

@Test(priority=2)
  public void testdata() {
	  System.out.println("data testing is done");
  }
  
}
