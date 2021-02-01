package com.aim.training.java.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUsingBufferedWriter {

	public static void main(String[] args) {
		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(new File("data/javaFile1.txt")));
			bw.write("i'm happy to write whole line in one shot");
			bw.newLine();
			bw.write("this is really good and faster");
			bw.newLine();
		}
		catch(IOException ex) {
			System.out.println("Exception while writing into file");
		}
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
