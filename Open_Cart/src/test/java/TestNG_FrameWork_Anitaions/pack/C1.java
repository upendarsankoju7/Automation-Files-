package TestNG_FrameWork_Anitaions.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

	@Test
	void abc()
	{
		System.out.println(" this is abc from C1..");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("this is BeforeTest method....");
	}
	
	
}
