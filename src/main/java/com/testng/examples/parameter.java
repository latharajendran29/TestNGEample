package com.testng.examples;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	@Test
	@Parameters({"usernmae","password"})
	public void sample(String name,String password) {
	System.out.println(name+password);
	

}


}
