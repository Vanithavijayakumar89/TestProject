package TestNGPrograms;

import org.testng.annotations.Test;
public class GroupingConcept 
{

  
@Test (groups="X")
  
public void f1() 
{
	  
System.out.println("Printing f1");
  
}
  
  

@Test (groups="Y")
  
public void f2() 
{
	  
System.out.println("Printing f2");
  
}
  
  

@Test (groups="X")
  
public void f3() 
{
	  
System.out.println("Printing f3");
  
}


}
