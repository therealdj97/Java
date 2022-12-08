package com.assignment10.Entity;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class q6Entity {
	public void FileInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name");
		String name = sc.nextLine();
		File f1 = new File("D:\\Documents\\"+name);
		System.out.println("Name of the file: "+f1.getName());
		System.out.println("File exists or not: "+f1.exists());
		System.out.println("Size of the file in bytes: "+f1.length());
		
	}
	public void readData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String name = sc.nextLine();
		File f1 = new File("D:\\Documents\\"+name);
		try(FileReader reader = new FileReader(f1)){
			int x;
			String str = "";
			while((x=reader.read())!= -1) {
				str = str + (char) x;
			}
			System.out.println("Data: "+str);
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("file not found");;
		}}}
