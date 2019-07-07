package com.testng.examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Iannot implements IAnnotationTransformer{


public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	IRetryAnalyzer retryanalzer=annotation.getRetryAnalyzer();	
	if(retryanalzer==null) {
	annotation.setRetryAnalyzer(Retryanalzer.class);
		}
		}
}
