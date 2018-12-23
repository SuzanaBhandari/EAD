package com.studentinfo.utils;

import java.sql.Timestamp;

public class DatabaseLogger implements Logger {

	@Override
	public void logInto(Timestamp timestamp, String name) {
		System.out.println("DatabaseLogger: " + name + " logged in at " + timestamp);

	}

}
