package com.aim.training.java.io;

import java.io.File;
import java.io.IOException;

public class FileOperationsDemo {
	
	public static void printFileInfo(File f) 
	{
		System.out.println("File alreay Exist!");
		System.out.println("Can i read - " + f.canRead());
		System.out.println("Can i Write - " + f.canWrite());
		System.out.println("Can i Execute - " + f.canExecute());
		System.out.println("Name of the file - "+ f.getName());
		System.out.println("Absolute path of the file - " + f.getAbsolutePath());
		System.out.println("is it a folder ???" + f.isDirectory());
		System.out.println("is it a file ???" + f.isFile());
	}
	public static void main(String[] args) {
		
		File f = new File("data");
		
		if(f.exists())
		{
			
			printFileInfo(f);
			System.out.println("--- printing file names ---");
			String[] filenames = f.list();
			for (String filename : filenames)
			{
				System.out.println(filename);
				
			}
			
			System.out.println("--- print absolute path of file ---");
			File[] fileObjs = f.listFiles();
			for (File file : fileObjs) {
				System.out.println("------------------------------------");
				printFileInfo(file);
				System.out.println("*************************************");
				
			}
			
		}
		else
		{
			try 
			{
				System.out.println("creating a new file");
				f.createNewFile();
			} 
			catch (IOException e) 
			{
				System.out.println("Exception while creating file!!!");
			}
		}
	}

}
