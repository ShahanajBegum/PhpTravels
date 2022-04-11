package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader implements FrameWorkConstants{
	
//	public  String getValueProperty(String Key) throws IOException {
//		String path="./PropertyFile/Configure.Property";
//		File file=new File(path);
//		FileInputStream fis=new FileInputStream(file);
//		Properties prop=new Properties();
//		prop.load(fis);
//		String value=prop.getProperty(Key);
//		
//		return Key;
		
	//	}
	public String  getValueProperty(String key) {
		FileInputStream file;
		Properties properties = null;
		try {
			file = new FileInputStream(PROPERTYFILE_PATH);
			properties=new Properties();
			properties.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return properties.getProperty(key);
	}

}
