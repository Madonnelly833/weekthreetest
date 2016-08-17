package com.weekthreetest;

import java.util.Scanner;

public class Car extends Vehicle{
	
	static Scanner sc = new Scanner(System.in);
	
	static String carModel = null;
	static int doors = 0;
	static boolean isRunning = false;
	static int wheels = 0;
	static boolean hasDinosaur = true;
	
	public Car(String carModel, int doors, boolean isRunning, int wheels, boolean hasDinosaur) {
		super();
		this.carModel = carModel;
		this.doors = doors;
		this.isRunning = isRunning;
		this.wheels = wheels;
		this.hasDinosaur = hasDinosaur;
	}
	
	public Car(){
		
	}

	public static void main(String[] args) {
		
		Car Alan = new Car();
		
		System.out.println("Hey, you have a car. Good for you!");
		System.out.println("What model is it?");
		carModel = sc.nextLine();
		System.out.println("How many doors does it have?");
		String doorsInput = sc.nextLine();
		doors = Integer.parseInt(doorsInput);
		System.out.println("How many wheels does it have?");
		String wheelsInput = sc.nextLine();
		wheels = Integer.parseInt(wheelsInput);
		System.out.println("Is it running? Yes or No");
		String runningInput = sc.nextLine();
		
		if(runningInput.equalsIgnoreCase("yes")){
			isRunning = true;
			
		}else{
			isRunning = false;
		}
		
		System.out.println("Does it have a dinosaur? Yes or Yes (Always yes)");
		String dinosaurInput = sc.nextLine();
		
		if(dinosaurInput.equalsIgnoreCase("yes")){
			hasDinosaur = true;
			
		}else{
			hasDinosaur = true;
		}
		
		
			
		
		
		System.out.println("I'm not printing all that out, you're crazy. You just told me what it is, why am I telling you again?");
		
		}



	public void engineOn() {
		System.out.println("Vroom Vroom");
		
	}

	@Override
	public void radioOn() {
		System.out.println("Time to listen to some tunes!");
		
	}

}
