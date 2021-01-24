package com.xworkz.forest;

import com.xworkz.forest.DomesticAnimals;
import com.xworkz.forest.WildAnimal;

public class AnimalTester {
	public static void main(String[] args) {

		Animal animal = new Animal();

		animal.setType("Domestic or Wild");
		System.out.println(animal.getType());

		animal.setName("cute or not");
		System.out.println(animal.getName());

		animal.setSize("Small or Big");
		System.out.println(animal.getSize());

		animal.setEat("Grass or Meat");
		System.out.println(animal.getEat());
		System.out.println("****************************");

		DomesticAnimals dom = new DomesticAnimals();

		dom.setType("Domestic");
		System.out.println(dom.getType());

		dom.setName("Cat");
		System.out.println(dom.getName());

		dom.setSize("Small");
		System.out.println(dom.getSize());

		dom.setEat("Milk");
		System.out.println(dom.getEat());
		System.out.println("****************************");

		WildAnimal wild = new WildAnimal();

		wild.setType("Wild");
		System.out.println(wild.getType());

		wild.setName("lion");
		System.out.println(wild.getName());

		wild.setSize("Big");
		System.out.println(wild.getSize());

		wild.setEat("Meat");
		System.out.println(wild.getEat());
		System.out.println("****************************");

	}
}
