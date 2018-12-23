package com.studentinfo.utils;

import java.sql.Timestamp;

public interface Logger {
	public void logInto(Timestamp timestamp,String name);
}
