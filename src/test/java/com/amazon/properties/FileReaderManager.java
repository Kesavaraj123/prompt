package com.amazon.properties;

import java.io.IOException;

public class FileReaderManager {

	public FileReaderManager() {

	}

	public static FileReaderManager frInstance() {
		FileReaderManager frm = new FileReaderManager();
		return frm;

	}

	public ConfigurationReader crInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;

	}

}
