package cdelivery_demo_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cdelivery_demo.Excercise;

public class ExecTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
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
