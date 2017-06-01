package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorViewTest {
	  @Before
	  public void init() throws Exception {
	    System.out.println("Setting up ...");
	  }
	 
	  @After
	  public void destroy() throws Exception {
	    System.out.println("Tearing down ...");
	  }
	 
	  @Test
	  public void test1() {
	    Assert.assertNull(null);
	  }
	  
	  @Test
	  public void test2() {
	    Assert.assertNull(null);
	  }
}
