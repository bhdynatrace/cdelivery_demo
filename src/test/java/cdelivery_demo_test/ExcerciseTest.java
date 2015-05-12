package cdelivery_demo_test;

import org.junit.*;

import cdelivery_demo.Excercise;


public class ExcerciseTest {
	
	@Test
	public void testExcercise()
	{
		Excercise ex = new Excercise();
		
		ex.RunDemoDBFunctions();
		ex.RunDemoProblem1();
		ex.RunDemoWebServiceCalls();
		
	}

}
