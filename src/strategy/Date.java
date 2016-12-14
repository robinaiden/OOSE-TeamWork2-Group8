package strategy;

public class Date {
	
	private static Date date = new Date();
	private DiscountStrategy strategy;
	
	private Date() {
		
	}
	
	public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }
	
	public DiscountStrategy holiday() {
		setStrategy(new TenPercentOffAlgorithm());
		return strategy;
	}
	
	public DiscountStrategy festival() {
		setStrategy(new TwentyPercentOffAlgorithm());
		return strategy;
	}
	
	public static Date getInstance()
	{    
		return date;
	}
	
}