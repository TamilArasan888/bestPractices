package com.chainsys.bestPractices.coupled;

public class TestCar {

	public static void main(String[] args) {
		Car cr=new Car();
		cr.startCar();
		SteelWheel[] carWheels=cr.getWheels();
		int length=carWheels.length;
		for(int i=0;i<length;i++) {
			System.out.println(carWheels[i].location);
		}
	}

}
