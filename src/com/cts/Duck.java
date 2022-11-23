package com.cts;

import com.cts.behaviour.Flyable;
import com.cts.behaviour.Quakable;
import com.cts.behaviour.Swimmable;
// IS-A relationship - inheritance
// HAS-A - compostion
public abstract class Duck {	
	// composition
	protected Flyable flyable;
	protected Swimmable swimmable;
	protected Quakable quakable;
	
	public abstract void display();
	
	public void performFly() {
		this.flyable.fly();
	}
	
	public void performQuack() {
		this.quakable.quack();
	}
	
	public void performSwim() {
		this.swimmable.swim();
	}
	
	// setter injection
		public void setFlyable(Flyable flyable) {
			this.flyable = flyable;
		}
		
		public void setQuakable(Quakable quakable) {
			this.quakable=quakable;
		}
		
		public void setSwimmable(Swimmable swimmable) {
			this.swimmable=swimmable;
		}


}
