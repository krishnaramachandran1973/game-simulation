package com.cts.behaviour.impl;

import com.cts.behaviour.Flyable;

public class FlyNoWay implements Flyable{

	@Override
	public void fly() {
		System.out.println("I can't fly");
		
	}

}
