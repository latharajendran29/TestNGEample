package com.testng.examples;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Optional2 {
	@Test
	@Parameters({"userNmae","password"})
	public void sample(@Optional("duck")String name,String password) {
	System.out.println(name+password);
}
}