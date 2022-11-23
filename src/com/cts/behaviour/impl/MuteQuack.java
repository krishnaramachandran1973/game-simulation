package com.cts.behaviour.impl;

import com.cts.behaviour.Quakable;

public class MuteQuack implements Quakable{

	@Override
	public void quack() {
		System.out.println("Silence");
		
	}

}
