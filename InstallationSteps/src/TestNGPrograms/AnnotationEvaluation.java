package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationEvaluation {
  @Test
  public void f1() {
	  System.out.println("Printing f1");
  }
  
  @Test
  public void f2() {
	  System.out.println("Printing f2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before test case execution");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After test case execution");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Have the test data");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("check whether the test data is present in DB");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BROWser preferences");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Close the browser");
  }

}
