package com.inspire.pkg;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestJava {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	    String file = req.getParameter("file");

	    File fileUnsafe = new File(file);
	    fileUnsafe.delete();
	}

	int x;
	
	int y=12;
	
	String tempo = "temp string";
	
	
}
