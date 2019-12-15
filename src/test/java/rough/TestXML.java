package rough;

import utilities.XMLReader;

public class TestXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XMLReader xml=new XMLReader(System.getProperty("user.dir")+"\\src\\test\\resources\\locators\\OR.xml");
		System.out.println(xml.getLocator("username.css"));
		
		
		//driver.findElement(By.xpath(xml.getLocator(""homepage.headers.username.css")).sendKeys("");
	}

}
