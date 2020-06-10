package lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class LabTest{
	
	// this function test fahernhite centigrade conversion
	@Test
	public void TestCaseForConversionFahernhite()
	{
		assertEquals(4 ,  Lab.fahrenheitToCentigrade(40));
	}
	
	// this test centigrade to faharnhite coversion
	@Test
	public void TestCaseForConversionCentigradeToFahernhite()
	{
		assertEquals(122 ,  Lab.centigradeToFahrenheit(50));
	}
	
	//tesing curent day
	@Test
	public void TestCaseForGetCurrentDay()
	{
		assertEquals(10 ,  Lab.getCurrentDay());
	}
	
	//testing removing sign
	
	@Test
	public void TestCaseForRemovingSign()
	{
		assertEquals("are you good" ,  Lab.removeSignOfExclaimation("are you good!"));
	}
	@Test
	public void TestCaseForGettingCurrentMonth()
	{
		assertEquals(6 ,  Lab.getCurrentMonth());
	}
	
	@Test
	public void TestCaseForGetCurrentYear()
	{
		assertEquals(2020 ,  Lab.getCurrentYear());
	}
	
}


