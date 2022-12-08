package com.assignment11.entity;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
	private File srcFile = new File("D:\\cover.jpg");
	private File destFile = new File("D:\\democopy.jpg");
	
	public void copyData() {
		try(FileInputStream fin = new FileInputStream(srcFile);
				BufferedInputStream bin = new BufferedInputStream(fin);
				FileOutputStream fout = new FileOutputStream(destFile);
				BufferedOutputStream bout = new BufferedOutputStream(fout)){
					
					byte[] arr = new byte[1024];
					int count;
					
					while((count = bin.read(arr)) > 0) {
						
						bout.write(arr, 0, count);
					}
					
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
}
