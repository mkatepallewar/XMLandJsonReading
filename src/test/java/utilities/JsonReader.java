package utilities;

import java.io.File;
import java.io.IOException;

import com.jayway.jsonpath.JsonPath;

public class JsonReader {
	private File jsonFile;
	
	public String fileName;
	
	public JsonReader(String fileName) {
		this.fileName=fileName;
	}
	
	public String getLocator(String locator) throws IOException {
		jsonFile=new File(fileName);
		String data=JsonPath.read(jsonFile, "$."+locator);
		
		return data;
//		JasonPath 
		
	}
	

}
