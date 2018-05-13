import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Day1 {
	
	public static boolean dbConnection() {
		return true;
		
	}
	
	@BeforeClass
	public static void SeleniumSetup() {
		System.out.println("Selenium Server start");
		Assume.assumeTrue(dbConnection());
	}
	
	
	
	@Before
	public void openBrowser() {
		System.out.println("Open Browser");
	}
		
	@Test
	public void alogin() {
		System.out.println("login test");
		
	}
	@Test
	public void CheckDashboard() {
		System.out.println("Check Dashboard");
	}
	@After
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterClass
	public static void SeleniumSetupClose() {
		System.out.println("Selenium Server Close");
	}

}
