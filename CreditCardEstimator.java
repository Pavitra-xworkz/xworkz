package basic;

public class CreditCardEstimator {
		
		private static double totalAmount;
		
		public static double getTotalAmount() {
			return totalAmount;
		}
		public static void request(int amount,String day) {
			System.out.println("amount requested:"+amount);
			System.out.println("requested day:"+day);
			totalAmount=totalAmount+amount;
			System.out.println("totalAmount");
		}

		public static void expenditure(double amount) {
			if (amount<1000) {
				System.out.println("expended amount:"+amount);
				totalAmount=totalAmount-amount;
				System.out.println(totalAmount);
			}
			else {
				System.out.println("expenditure must be 1000rs");
		
			}
			

		}

	}



