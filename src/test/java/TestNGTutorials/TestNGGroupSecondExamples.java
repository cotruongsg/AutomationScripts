package TestNGTutorials;

import org.testng.annotations.Test;

public class TestNGGroupSecondExamples 
{
    @Test(groups="Regression")
	public void testCase5()
	{
		System.out.println("Im in testCaseFive - And in Regression Group");
	}
	@Test(groups="Regression")
	public void testCase6()
	{
		System.out.println("Im in testCaseSix - And in Regression Group");
	}

}
