package com.cts;

import com.cts.behaviour.impl.DeepDive;
import com.cts.behaviour.impl.FlyNoWay;
import com.cts.behaviour.impl.FlyUpInTheSky;
import com.cts.behaviour.impl.FlyWithWings;
import com.cts.behaviour.impl.Quack;
import com.cts.behaviour.impl.Squeak;

public class SimUDuck {
	public static void main(String[] args) {
		Duck duck1 = new MallardDuck(new FlyWithWings(), new Quack(), new DeepDive());
		Duck duck2 = new ReadheadDuck();
		duck2.setFlyable(new FlyUpInTheSky());
		duck2.setQuakable(new Squeak());
		duck2.setSwimmable(new DeepDive());
		
		duck1.performFly();
		duck1.performQuack();
		duck1.performSwim();
		
		duck2.performFly();
		duck2.performQuack();
		duck2.performSwim();

	}

}
