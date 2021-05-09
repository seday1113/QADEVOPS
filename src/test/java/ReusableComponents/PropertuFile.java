package ReusableComponents;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;

public class PropertuFile {
	
	public static Properties prop = new Properties();
	
	public static String getPropertyByValue(String key) throws Exception{
		
		String propFile = System.getProperty("user.dir")+"/src/test/java/Config/config.properties";	
		
		System.out.println(propFile);
		
		FileInputStream ip = new FileInputStream(propFile);
		prop.load(ip);
		
		String value = prop.get(key).toString();
		
		System.out.println(value);
		
		if(StringUtils.isEmpty(value)){
			throw new Exception (" value is not specified for key "+key +" in proptry file");
		}
		
		return value;
		
		
	}
	
	

}
