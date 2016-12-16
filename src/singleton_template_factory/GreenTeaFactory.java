package singleton_template_factory;

import strategy.DiscountStrategy;

public class GreenTeaFactory extends TeaFactory{
	
	private static GreenTeaFactory instance = null;
	public boolean customerWantsIce() { return false; }
	
	private GreenTeaFactory(DiscountStrategy strategy) {
		super(strategy);
	}
	
	@Override
	protected TeaProduct CreateTea() {
		// TODO Auto-generated method stub
		return new GreenTeaProduct();
	}
	
	@Override
	public void brew() {
		System.out.println("	Brew Green Tea Bag.");
	}

	@Override
	public void addIce() {}

	@Override
	public void addSugar() {
		System.out.println("	Adding Suger.");
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
