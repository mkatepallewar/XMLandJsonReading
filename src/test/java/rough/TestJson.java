package rough;

import java.io.IOException;

import utilities.JsonReader;

public class TestJson {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JsonReader json=new JsonReader(System.getProperty("user.dir")+"\\src\\test\\resources\\locators\\OR.json");
		System.out.println(json.getLocator("locators.homepage.username.xpath"));
	}

}
