package com.Assignment8.interfaces;

import com.Assignment8.implemet.Numbers;

public class Average implements Numbers{
	
	public float process(int x, int y) {
		float avg = x+y/2;
		return avg;
	}
}
