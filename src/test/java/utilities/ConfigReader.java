package utilities;

import java.io.*;
import java.util.*;
public class ConfigReader {
	Properties prop;
	public ConfigReader() {
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("config.properties");
			prop.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public String getUrl() {
		return prop.getProperty("url");
	}
	public String getBrowser() {
		return prop.getProperty(getBrowser());
	}

}
