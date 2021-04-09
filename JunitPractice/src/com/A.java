package com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class A extends Base{
    
	
//	@Before
//	public void start(){
//		//1.Open a blank browser
//		//2.Goto Url
//				
//	}
//	@After
//	public void end(){
//		//close the browser
//	}
	
	
	
	@Test
	public void test1() {
		Assert.assertEquals(3+6,9);
		Assert.assertFalse(4<5);
		Assert.assertTrue(4<5);
		
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	
	@Test
	public void test3() {
	    System.out.println("test3");
	}
	
	
	@Test
	public void test4() {
		System.out.println("test4");
	}
		


}
