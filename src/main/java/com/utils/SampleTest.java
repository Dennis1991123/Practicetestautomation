package com.utils;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(priority=-1)
	   public void test1() {
	      System.out.println("Starting execution of TEST1");
	   }
	   @Test(priority=-2)
	   public void test2() {
	      System.out.println("Starting execution of TEST2");
	   }
	   @Test()
	   public void test3() {
	      System.out.println("Starting execution of TEST3");
	   }
	   @Test()
	   public void atest3() {
	      System.out.println("Starting execution of TEST4");
	   }



}
