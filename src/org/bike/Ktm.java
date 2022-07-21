package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("ktm bike cost more than a lakh");
		System.out.println("ktm bike cost more than a lakh");
		System.out.println("ktm bike cost more than a lakh");
		
	}

	@Override
	public void speed() {
		System.out.println("speed is you can't imagine");
		System.out.println("speed is you can't imagine");
		System.out.println("speed is you can't imagine");
		
	}
	
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	
	}

}
