package cdelivery_demo_test;

import org.junit.Test;

import junit.framework.TestCase;
import cdelivery_demo.Excercise;

public class ExcerciseTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testExcercise()
	{
		Excercise ex = new Excercise();
		
		ex.RunDemoDBFunctions();
		ex.RunDemoProblem1();
		ex.RunDemoWebServiceCalls();
		
	}

}
