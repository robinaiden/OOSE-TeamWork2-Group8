package singleton_template_factory;

import strategy.DiscountStrategy;

public class BlackTeaFactory extends TeaFactory{
	
	private static BlackTeaFactory instance = null;
	
	private BlackTeaFactory(DiscountStrategy strategy) {
		super(strategy);
		System.out.println("Creating BlackTeaFactory...");
	}
	
	@Override
	protected TeaProduct CreateTea() {
		// TODO Auto-generated method stub
		return new BlackTeaProduct();
	}

	public static BlackTeaFactory getInstance(DiscountStrategy strategy) {
		if(instance == null) {
			instance = newInstance(strategy);
		}
		return instance;
	}
	
	private static BlackTeaFactory newInstance(DiscountStrategy strategy) {
		return new BlackTeaFactory(strategy);
	}
	
}
