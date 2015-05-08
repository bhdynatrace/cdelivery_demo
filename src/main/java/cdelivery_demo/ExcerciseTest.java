package cdelivery_demo;

import cdelivery_demo.Excercise;	
import junit.framework.TestCase;

public class ExcerciseTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testExcercise()
	{
		Excercise ex = new Excercise();
		
		ex.RunDemoDBFunctions();
		ex.RunDemoProblem1();
		ex.RunDemoWebServiceCalls();
		
	}

}
