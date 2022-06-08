package com.chainsys.bestPractices.decoupled;

public class TestCar {

	public static void main(String[] args) {
		PetrolEngine pe=new PetrolEngine();
		SteelWheel[] sWheels=new SteelWheel[4];
		sWheels[0]=new SteelWheel();
		sWheels[0].location="front left";
		sWheels[1]=new SteelWheel();
		sWheels[0].location="front right";
		sWheels[2]=new SteelWheel();
		sWheels[0].location="back left";
		sWheels[3]=new SteelWheel();
		sWheels[0].location="back right";
		Car cr=new Car(pe,sWheels);
		cr.startCar();
		SteelWheel[] carWheels=(SteelWheel[])cr.getWheels();
		int length=carWheels.length;
		for(int i=0;i<length;i++) {
			System.out.println(carWheels[i].location);
		}
		DieselEngine de=new DieselEngine();
		WoodenWheel[] wWheels=new WoodenWheel[4];
		wWheels[0]=new WoodenWheel();
		wWheels[0].location="front left";
		wWheels[1]=new WoodenWheel();
		wWheels[0].location="front right";
		wWheels[2]=new WoodenWheel();
		wWheels[0].location="back left";
		wWheels[3]=new WoodenWheel();
		wWheels[0].location="back right";
		Car secondCar=new Car(de,wWheels);
		secondCar.startCar();
		
		WaterEngine we=new WaterEngine();
		Car thirdCar=new Car(we,wWheels);
		thirdCar.startCar();
	}

}
