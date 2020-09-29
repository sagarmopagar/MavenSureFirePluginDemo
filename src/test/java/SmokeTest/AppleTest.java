package SmokeTest;

import org.testng.annotations.Test;

public class AppleTest {

	
	@Test(groups = {"version1","version2"})
	public void appleTest() {
		System.out.println("Testing apples");
		
		//Reading System Property Variable from pom.xml
		String BrowserOfChoice = System.getProperty("BrowserOfChoice");
		System.out.println("You have chosen to run your tests in \""+BrowserOfChoice+"\"");
		
		//Fetch Project Build Directory:
		String BuildDirectory = System.getProperty("BuildDirectory");
		System.out.println(BuildDirectory);
	}

	@Test(groups= {"version3"})
	public void additionalTest() {
		System.out.println("Gets executed if you specify group = version3 in maven xml");
	}
	
}
