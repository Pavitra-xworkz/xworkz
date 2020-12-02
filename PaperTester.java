package com.xworkz.constructor;

public class PaperTester {

	public static void main(String[] args) {
		Paper paper=new Paper("white","20px","30px");
		String brand=paper.getBrand();
		String color=paper.getColor();
		String width=paper.getWidth();
		String height=paper.getHeight();
		
		System.out.println(brand);
		System.out.println(color);
		System.out.println(width);
		System.out.println(height);

	}

}
