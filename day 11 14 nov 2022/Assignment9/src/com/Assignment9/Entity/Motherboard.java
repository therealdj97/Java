package com.Assignment9.Entity;

public class Motherboard {
	public static class usb{
		static int usb2=2;
		static int usb3=1;
		public static int getTotalPorts() {
			int TotalNumberOfPorts=usb2+usb3;
			return 	TotalNumberOfPorts;
		}
	}

}
