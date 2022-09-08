package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader implements FrameWorkConstants {
	
	public static String readDataFromProperty(String key) throws IOException {
	
		    FileInputStream	fis=new FileInputStream(Property_Path);
		    Properties prop=new Properties();
		    prop.load(fis);
		    String value=prop.getProperty(key);
		    return value;
		  		
	}	
}
//	public static String  readDataFromProperty(String key) {
//		FileInputStream file;
//		Properties properties = null;
//		try {
//			file = new FileInputStream(Property_Path);
//			properties=new Properties();
//			properties.load(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}		
//		return properties.getProperty(key);
//	}
//		
//	}


