package strategy;

public class TenPercentOffAlgorithm implements DiscountStrategy{
	
	public double discount(double price) {
		System.out.println("Discount 10% off.");
		return price * 0.9;
	}
	
}
