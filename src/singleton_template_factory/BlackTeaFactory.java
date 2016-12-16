package singleton_template_factory;

import strategy.DiscountStrategy;

public class BlackTeaFactory extends TeaFactory{
	
	private static BlackTeaFactory instance = null;
	
	private BlackTeaFactory(DiscountStrategy strategy) {
		super(strategy);
	}
	
	@Override
	protected TeaProduct CreateTea() {
		// TODO Auto-generated method stub
		return new BlackTeaProduct();
	}
	
	@Override
	public void brew() {
		System.out.println("	Brew Black Tea Bag.");
	}

	@Override
	public void addIce() {
		System.out.println("	Adding Ice.");
	}

	@Override
	public void addSugar() {
		System.out.println("	Adding Suger.");
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
