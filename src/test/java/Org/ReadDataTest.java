package Org;

import org.testng.annotations.Test;

public class ReadDataTest {
	
	@Test
	
	public void readData()
	{
		String BROWSER= System.getProperty("browser");
		System.out.println(BROWSER);
		
		String URL= System.getProperty("url");
		
		System.out.println(URL);
		
			
	}

}
