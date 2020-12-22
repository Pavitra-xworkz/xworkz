package com.xworkz.bakery.cake;

import com.xworkz.bakery.cake.Cake;
import com.xworkz.bakery.cake.HoneyCake;

public class TasteTester {
	public static void main(String[] args) {

		Cake cake = new Cake();

		cake.setFlavour("Pineapple");
		System.out.println(cake.getFlavour());
		cake.setShape("round");
		System.out.println(cake.getShape());
		cake.setSize(5.03);
		System.out.println(cake.getSize());
		System.out.println("****************************");

		HoneyCake honey = new HoneyCake();

		honey.setFlavour("Honey");
		System.out.println(honey.getFlavour());
		honey.setShape("Square");
		System.out.println(honey.getShape());
		honey.setSize(3.08);
		System.out.println(honey.getSize());
		System.out.println("****************************");

	}

}
