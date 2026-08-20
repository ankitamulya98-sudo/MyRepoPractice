package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FetchDatafromPropertiesFile {
	
	public static Properties get_data_from_property() throws IOException
	{
		FileReader f = new FileReader(ConstantsData.ConstantsData.PROP_FILE_PATH);
		Properties prop = new Properties();
		prop.load(f);
		return prop;
		
	}

}
