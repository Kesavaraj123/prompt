package com.amazon.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

public class ConfigurationReader {
	public static Properties p;

	public ConfigurationReader() throws IOException {
		File f = new File(
				"C:\\Users\\kesavaraj\\eclipse-workspace\\AmazonCucumber\\src\\test\\java\\com\\amazon\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getBrowser() {
		String bname = p.getProperty("Browsername");
		return bname;
              
	}
	public String getUrl() {
		String gurl = p.getProperty("gettenUrl");
		return gurl;

	}

}
