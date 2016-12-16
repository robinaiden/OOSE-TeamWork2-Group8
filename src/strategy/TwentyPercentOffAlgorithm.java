package strategy;

public class TwentyPercentOffAlgorithm implements DiscountStrategy{
	
	public double discount(double price) {
		System.out.println("Discount 20% off.");
		return price * 0.8;
	}
	
}
