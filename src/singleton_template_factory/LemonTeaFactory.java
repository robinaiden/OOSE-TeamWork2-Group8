package singleton_template_factory;

import strategy.DiscountStrategy;

public class LemonTeaFactory extends TeaFactory{
	
	private static LemonTeaFactory instance = null;
	public boolean customerWantsSugar() { return false; }
	
	private LemonTeaFactory(DiscountStrategy strategy) {
		super(strategy);
	}
	
	@Override
	protected TeaProduct CreateTea() {
		// TODO Auto-generated method stub
		return new LemonTeaProduct();
	}
	
	@Override
	public void brew() {
		System.out.println("	Brew Lemon Tea Bag.");
	}

	@Override
	public void addIce() {
		System.out.println("	Adding Ice.");
	}

	@Override
	public void addSugar() {}
	
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
