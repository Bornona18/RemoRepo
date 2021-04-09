package com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Base {
	
	@BeforeClass
	public static void start(){
		System.out.println("go to urll");
	}
	
	@AfterClass
	public static void end(){
		System.out.println("close the browser");
	}
	
	
	
//	@Before
//	public static void start(){
//		System.out.println("go to urll");
//	}
//	
//	@After
//	public static void end(){
//		System.out.println("close the browser");
//	}

}
