package basic;

public class CreditCardTester {

	public static void main(String[] args) {
		CreditCardEstimator.request(1500,"tuesday");
		CreditCardEstimator.expenditure(1200);
		double totalMoney=CreditCardEstimator.getTotalAmount();
		
		System.out.println("Total money:"+totalMoney);

	}

}




