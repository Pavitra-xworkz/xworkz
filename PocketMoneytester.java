package com.xworkz;

public class PocketMoneytester {

	public static void main(String[] args) {
		PocketMoneyEstimator.request(1500,"tuesday");
		PocketMoneyEstimator.expenditure(900);
		double totalMoney=PocketMoneyEstimator.getTotalAmount();
		
		System.out.println("Total money:"+totalMoney);

	}

}
