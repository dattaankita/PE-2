package com.stackroute.PE_2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.PE_2.App;
/**
 * Unit test 
 */
public class AppTest {
private static App app;

@BeforeClass
public static void setup() {
	// This methods runs, before running any one of the test case
	// This method is used to initialize the required variables
	app = new App();

}

@AfterClass
public static void teardown() {
	// This method runs, after running all the test cases
	// This method is used to clear the initialized variables
	app = null;

}

@Test
public void isPalindromeTest() {

	assertEquals(true,app.isPallindrome("abababa"));
	
	assertNotEquals(false,app.isPallindrome("aba"));
	
	assertEquals(false,app.isPallindrome("abc"));
	
}


@Test
public void isPow4Test() {

	assertEquals(true,app.isPow4(16));
	
	assertEquals(false,app.isPow4(81));
	
	assertNotEquals(true,app.isPow4(10));
	
}

@Test
public void getMemVarTest() {

	assertArrayEquals(new Object[] {"Harry Potter", 30 ,2500.3}, app.ob.getMemVar("Harry Potter", 30 ,2500.3));
    
	assertNotNull(app.ob.getMemVar("Harry Potter", 30 ,2500.3));

	assertNull(null, app.ob.getMemVar(null, 0 ,0));
}

@Test
public void isEvenTest() {
	assertEquals(true, app.e.isEven(98));
	assertEquals(false, app.e.isEven(99));
	assertNotEquals(false, app.e.isEven(98));
}

@Test
public void studentTest() {
	assertArrayEquals(new double[] {81.50, 65, 98}, app.stgrad(4,new int[]{86, 65, 98, 77}),0);
}

@Test
public void studentFailure() {
	assertNotEquals(new double[] {81, 65, 98}, app.stgrad(4,new int[]{86, 65, 98, 77}));
}

@Test
public void factTest() {
	assertEquals(3628800, app.longFactorial(10));
	assertEquals(1, app.longFactorial(1));
	assertEquals(120, app.longFactorial(5));
}

@Test
public void factFailure() {
	assertNotEquals(62270208, app.longFactorial(11));
	assertNotEquals(62270208, app.longFactorial(12));
	assertNotEquals(62270208, app.longFactorial(13));
}

}

