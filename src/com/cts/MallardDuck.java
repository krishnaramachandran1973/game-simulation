package com.cts;

import com.cts.behaviour.Flyable;
import com.cts.behaviour.Quakable;
import com.cts.behaviour.Swimmable;
// Spring DI
public class MallardDuck extends Duck {
	// constructor injection
	public MallardDuck(Flyable flyable, Quakable quakable, Swimmable swimmable) {
		this.flyable=flyable;
		this.quakable=quakable;
		this.swimmable=swimmable;
	}

	@Override
	public void display() {
		System.out.println("Mullard duck is displayed here");
	}
}
