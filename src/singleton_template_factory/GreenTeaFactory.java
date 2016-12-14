package singleton_template_factory;

import strategy.DiscountStrategy;

public class GreenTeaFactory extends TeaFactory{
	
	private static GreenTeaFactory instance = null;
	
	private GreenTeaFactory(DiscountStrategy strategy) {
		super(strategy);
		System.out.println("Creating GreenTeaFactory...");
	}
	
	@Override
	protected TeaProduct CreateTea() {
		// TODO Auto-generated method stub
		return new GreenTeaProduct();
	}
	
	public static GreenTeaFactory getInstance(DiscountStrategy strategy) {
		if(instance == null) {
			instance = newInstance(strategy);
		}
		return instance;
	}
	
	private static GreenTeaFactory newInstance(DiscountStrategy strategy) {
		return new GreenTeaFactory(strategy);
	}

}
