package com.interfaces.interfaces;

public interface ABC {
	default void show() {
		System.out.println("default show() of ABC called");
	}
	void display();
}

