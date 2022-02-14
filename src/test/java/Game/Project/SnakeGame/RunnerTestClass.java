package Game.Project.SnakeGame;

import org.junit.runner.*;
import org.junit.runner.notification.*;

public class RunnerTestClass 
{
	public static void main(String args[])
	{
		Result r=JUnitCore.runClasses(AppTest.class);
		for(Failure fail: r.getFailures())
		{
			System.out.println(fail.toString());
		}
		System.out.println("Result:"+r.wasSuccessful());
	}

}
