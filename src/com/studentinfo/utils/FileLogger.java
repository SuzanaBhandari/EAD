package com.studentinfo.utils;

import java.sql.Timestamp;

public class FileLogger implements Logger {

	@Override
	public void logInto(Timestamp timestamp, String name) {
		System.out.println("FileLogger: " + name + " logged in at " + timestamp);

	}

}
