package CSVfiles;

import java.io.File;
import java.util.Properties;

public class PropertyUtils {

	public String getPropertyData(String filepath,String key)
	
    FileInputStream file =new FileInputStream(filepath);
	Properties properties= new properties();
	properties.load(file);
	return properties.getProperty(key);
	
	
	


}
