package strategy;

public class Checkstand {
	
	private static Checkstand date = new Checkstand();
	private DiscountStrategy strategy;
	
	private Checkstand() {
		
	}
	
	public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }
	
	public DiscountStrategy weekend() {
		setStrategy(new TenPercentOffAlgorithm());
		return strategy;
	}
	
	public DiscountStrategy weekday() {
		setStrategy(new TwentyPercentOffAlgorithm());
		return strategy;
	}
	
	public static Checkstand getInstance()
	{    
		return date;
	}
	
}
