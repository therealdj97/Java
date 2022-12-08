package com.assignment11.entity;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.assignment11.bean.Student;

public class SerializeDeSerialize {
	
	private File f1 = new File("D:\\Que3.dat");
	
	public void writeData() {
		try(FileOutputStream fout = new FileOutputStream(f1);
				ObjectOutputStream out = new ObjectOutputStream(fout)) {
			
			Student s1 = new Student(101, "Rushikesh", 22);
			Student s2 = new Student(102, "Dhiraj", 20);
			
			System.out.println("objects saved into the file");	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void readData() {
		try (FileInputStream fin = new FileInputStream(f1);
		ObjectInputStream oin = new ObjectInputStream(fin)) {
			
			while(true) {
				Student emp = (Student) oin.readObject();
				System.out.println(emp);
			}
		} 
		catch (EOFException exc) {
			System.out.println("all objects have been read from file");
		}
		catch (IOException | ClassNotFoundException exc) {
			exc.printStackTrace();
		}
	}
}
