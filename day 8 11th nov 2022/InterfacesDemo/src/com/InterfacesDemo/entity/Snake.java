package com.InterfacesDemo.entity;

//multiple inheritance
public class Snake implements AquaticAnimals, TerestialAnimals{

	@Override
	public void move_on_land() {
		// TODO Auto-generated method stub
		System.out.println("moves on land by creeping");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("moves under water by swimming");
	}

}
