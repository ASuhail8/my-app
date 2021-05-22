package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class generics implements AutoConstants {

	public static String getDataFromPropertyFile(String property) {

		Properties prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(PROPERTY_FILE_LOC);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop.getProperty(property);

	}

}
