package com.assignment11.main;
import java.time.LocalDateTime;
import com.assignment11.entity.CopyDemo;
public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			CopyDemo obj = new CopyDemo();
			LocalDateTime ldt = LocalDateTime.now();
			System.out.println("file copy started at : " + ldt);
			
			obj.copyData();
			
			ldt = LocalDateTime.now();
			System.out.println("file copy completed at : "+ldt);
	}
}
