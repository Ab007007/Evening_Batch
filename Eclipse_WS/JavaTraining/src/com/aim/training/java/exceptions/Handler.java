package com.aim.training.java.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;

public class Handler {

	static FileInputStream fis;
	public static void filereader(String fileName) throws FileNotFoundException {
		File f = new File(fileName);
		fis = new FileInputStream(f);

	}
}
