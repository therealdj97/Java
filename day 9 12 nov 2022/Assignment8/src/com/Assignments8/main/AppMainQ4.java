package com.Assignments8.main;

import com.Assignment8.implemet.Verify;

public class AppMainQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Verify ref = (a)-> {
			boolean flag = true;
			for(int i = 1; i<a/2;i++) {
				if(a%i==0) {
					 flag = true;
					 break;
				}
				else flag =false;
			}
			return flag;
		};
		System.out.println("941 is "+ref.check(941));
	}

}