package Game.Project.SnakeGame;

import static org.junit.Assert.*;
import org.junit.*;

public class AppTest
{
	@Before
	public void test()
	{
	System.out.println("Before");
	}
	@After
	public void tests()
	{
		System.out.println("After");
	}
	@BeforeClass
	public static void beforeTest()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public static void afterTest()
	{
		System.out.println("After Class");
	}
	@Test
	public void testCase()
	{
		System.out.println("Main Test Method");
		int a=7;
		assertTrue(a==7);
	}
	@Test(timeout=1000)
	public void testings()
	{
		System.out.println("AAA");
	}
	public static void main(String args[])
	{
		AppTest ap=new AppTest();
		AppTest.afterTest();
		AppTest.beforeTest();
		ap.test();
		ap.tests();
		ap.testings();
	}
    
}
