package com.studentinfo.utils;

import java.sql.Timestamp;

public class SessionLogger implements Logger {

	@Override
	public void logInto(Timestamp timestamp, String name) {
		System.out.println("SessionLogger: " + name + " logged in at " + timestamp);
	}

}
