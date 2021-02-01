package com.aim.training.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileInJavaUsingBufferedReader {
	static int count = 0;
	public static void main(String[] args) {
		
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			f = new File("data\\javaFile.txt");
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			//br = new BufferedReader(new FileReader(new File("")))
			
			String str;
			while((str = br.readLine()) != null)
			{
				System.out.println(str);
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
				br.close();
				fr.close();
				
			} catch (IOException e) {
				System.out.println("Exception while closing input stream");
			}
		}
	}

}
