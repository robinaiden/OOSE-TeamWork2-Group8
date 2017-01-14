package singleton_template_factory;

public class LemonTea extends TeaProduct {
	
	public boolean customerWantsSugar() { return false; }
	
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
	
	@Override
	public String getDescription() {
		return "LemonTea";
	}

	@Override
	public double getCost() {
		return 30;
	}
	
}
