package com.xworkz.solutions;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.solutions.DTO.ShoppingcartDTO;
public class CartTester {
	public static void main(String[] args) {
		ShoppingcartDTO cartDTO1=new ShoppingcartDTO();
		cartDTO1.setItemName("Salwar");
		cartDTO1.setPrice(2000);
		cartDTO1.setQuantity(1);
		
		ShoppingcartDTO cartDTO2=new ShoppingcartDTO();
		cartDTO2.setItemName("Shoe");
		cartDTO2.setPrice(1500);
		cartDTO2.setQuantity(1);
		
		Collection<ShoppingcartDTO> cartDTOs=new ArrayList<ShoppingcartDTO>();
		cartDTOs.add(cartDTO2);
		cartDTOs.add(cartDTO1);
		
		ShoppingcartDTO cartDTO3=new ShoppingcartDTO();
		cartDTO3.setItemName("Shoe");
		cartDTO3.setPrice(1600);
		cartDTO3.setQuantity(1);
		
		boolean contain=cartDTOs.contains(cartDTO3);
		System.out.println("Contains"+contain);
		
		//for each using to check item is equals
		for (ShoppingcartDTO shoppingcartDTO : cartDTOs) {
			  if(shoppingcartDTO.getItemName().equals("Shoe")) {
			  System.out.println("shoe is in cart"); 
			  } else
			  {
			  System.out.println("shoe is not in cart, can add");
			  } 
			  }
		// by using contains method to check the shoe is there or not
		if(contain)
		{
			System.out.println("shoe is in cart");
		}
		else {
			System.out.println("adding shoe to cart");
			cartDTOs.add(cartDTO3);
		}
		System.out.println("after adding shoe"+ cartDTOs.size());
		
		Collection<String> countrys=new ArrayList<String>();
		countrys.add("INDIA");
		countrys.add("AUSTRALIA");
		
		countrys.contains("INDIA");	
		
		boolean contains=countrys.contains("INDIA");
		System.out.println("Contains"+contain);
	}
	

}
