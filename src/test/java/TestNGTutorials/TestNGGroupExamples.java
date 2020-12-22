package TestNGTutorials;

import org.testng.annotations.Test;

public class TestNGGroupExamples
{
	@Test(groups="Regression")
	public void testCase1()
	{
		System.out.println("Im in testCaseOne - And in Regression Group");
	}
	@Test(groups="Regression")
	public void testCase2()
	{
		System.out.println("Im in testCaseTwo - And in Regression Group");
	}
	@Test(groups="Smoke Test")
	public void testCase3()
	{
		System.out.println("Im in testCaseThree - And in Smoke Test Group");
	}
	@Test(groups="Regression")
	public void testCase4()
	{
		System.out.println("Im in testCaseFour - And in Regression Group");
	}
}

