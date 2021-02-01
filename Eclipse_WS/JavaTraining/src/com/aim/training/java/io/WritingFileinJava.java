package com.aim.training.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingFileinJava {

	static FileOutputStream fos = null;
	public static void main(String[] args) {
		try
		{
			String str  = "This line is from java program...\n";
			fos = new FileOutputStream(new File("data/javaFile1.txt"), true);
			fos.write(str.getBytes());
		}
		catch(FileNotFoundException fos)
		{
			System.out.println("Exception while Creating object");
		}
		catch(IOException ex)
		{
			System.out.println("Exception while writing ");
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
