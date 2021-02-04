package TestNGTutorials;

import org.testng.annotations.Test;

//Default of priority @Test(priority=0) and execute by alphabet
public class TestNGPriority 
{	
	@Test
	public void registerAccount()
	{
		System.out.println("First register your account");
	}
	@Test(priority=2)
	public void sendEmail()
	{
		System.out.println("Send email after login");
	}
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login to the account after registration");
	}

}
