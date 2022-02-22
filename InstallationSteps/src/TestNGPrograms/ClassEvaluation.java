package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ClassEvaluation {
  @Test
  public void f1() {
	  System.out.println("Inside F1");
  }
  
  @Test
  public void f2() {
	  System.out.println("Inside F2");  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before any test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After all the tests");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before any test method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After every test method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

}
