package com.chainsys.bestPractices.decoupled;

public class PetrolEngine implements Iengine{
	public void start() {
		System.out.println("Petrol Engine started");
	}
	public void stop() {
		System.out.println("Petrol Engine stoped");
	}
}
