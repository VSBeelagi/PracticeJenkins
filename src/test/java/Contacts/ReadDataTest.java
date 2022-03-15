package Contacts;

import org.testng.annotations.Test;

public class ReadDataTest {
	@Test
	public void readDataTest()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		System.out.println(BROWSER);
		System.out.println(URL);
	}
	

}
