package com.aim.training.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFileInJava {
	static int count = 0;
	public static void main(String[] args) {
		
		File f = null;
		FileInputStream fis = null;
		
		try {
			f = new File("data\\javaFile.txt");
			fis = new FileInputStream(f);
			int i = 0;
			while((i = fis.read()) != -1)
			{
				System.out.print((char)i);
				count++;
			}
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("No File Found!!!");
		}
		catch(IOException ex)
		{
			System.out.println("Error while writing into file!!!");
		}
		finally
		{
			try {
				System.out.println();
				System.out.println("Closing all resources in finally" );
				System.out.println("total iterations " + count);
				fis.close();
			} catch (IOException e) {
				System.out.println("Exception while closing input stream");
			}
		}
	}

}
