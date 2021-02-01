package com.aim.training.java.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo 
{
	public static void main(String[] args) {
		System.out.println("--main started--");
		try
		{
			Handler.filereader("D:\\aimorc_training\\.gitignore");
		}
		catch(Exception ex)
		{
			System.out.println("Exception while using filereader, contact the filereader developer");
		}
		finally {
			try {
				Handler.fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("no obj created");
			}catch (NullPointerException ex)
			{
				System.out.println("no obj created");
			}
			System.out.println("i'm finally");
		}
		System.out.println("--main ended--");
		
	}
	
	

}
