package singleton_template_factory;

import strategy.DiscountStrategy;

public class LemonTeaFactory extends TeaFactory{
	
	private static LemonTeaFactory instance = null;
	
	private LemonTeaFactory(DiscountStrategy strategy) {
		super(strategy);
		System.out.println("Creating LemonTeaFactory...");
	}
	
	@Override
	protected TeaProduct CreateTea() {
		// TODO Auto-generated method stub
		return new LemonTeaProduct();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 30;
	}
	
	public static LemonTeaFactory getInstance(DiscountStrategy strategy) {
		if(instance == null) {
			instance = newInstance(strategy);
		}
		return instance;
	}
	
	private static LemonTeaFactory newInstance(DiscountStrategy strategy) {
		return new LemonTeaFactory(strategy);
	}

}
