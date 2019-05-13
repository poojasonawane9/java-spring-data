package com.capgemini.files.client;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {
	public static void main(String[] args) throws IOException {
		
//		File file = new File("C:\\Users\\poojsona\\Downloads\\New folder (2)\\BankAccount.java");
//		System.out.println(file.exists());
//		
//		File folder = new File("C:\\Users\\poojsona\\Downloads\\New folder 2");
//		System.out.println(folder.exists());
		
//		File file = new File("test.txt");
//		if(!file.exists()) {
//			file.createNewFile();
//			System.out.println("File is created");
//		}
		
		//FileWriter filWriter = new FileWriter(file);
		//BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
//		PrintWriter writer = new PrintWriter(new FileWriter(file,true));
//		writer.println("Hello");
//		writer.println("Welcome..");
//		writer.println("bye.....");
//		
//		writer.close();
//		System.out.println("content has been written sucessfullly");
		
		
//		FileReader reader= new FileReader("C:\\Users\\poojsona\\Downloads\\New folder (2)\\BankAccount.java");
//		BufferedReader bReader = new BufferedReader(reader);
//		
//		PrintWriter writer = new PrintWriter("BankAccount.java");
//		
//		String content;
//		while((content = bReader.readLine()) != null) {
//			//System.out.println(content);
//			writer.println(content);
//		}
//		
//		writer.close();
//		bReader.close();
//		reader.close();
		
//		--------------Display all folders in that folder--------------
//		File windowsDirectory = new File("C://windows");
//		System.out.println(windowsDirectory.isDirectory());
//		String content[] = windowsDirectory.list();
//		
//		for(String s: content) {
//			System.out.println(s);
//		}
//		
		File newDir = new File("myDir");
		if(! newDir.exists()) {
			newDir.mkdir();
			System.out.println("Folder is Successfully Created");
		}

		File file = new File(newDir,"myfile.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File is successfully created");
		}
	}
}
