package com.chainsys.bestPractices.defaultMethod;

public interface Ivehicle {
	void start();
	default void move() {
		System.out.println("Vehicle is moving!!");
	}

}
class Car implements Ivehicle
{
	@Override
	public void start() {
		System.out.println("car is starting!!");
	}
}
class Bike implements Ivehicle
{
	@Override
	public void start() {
		System.out.println("bike is starting!!");
	}
}
