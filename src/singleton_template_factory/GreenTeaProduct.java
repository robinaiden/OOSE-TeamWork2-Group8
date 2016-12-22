package singleton_template_factory;

public class GreenTeaProduct extends TeaProduct {
	
	public boolean customerWantsIce() { return false; }
	
	@Override
	public void brew() {
		System.out.println("	Brew Green Tea Bag.");
	}

	@Override
	public void addIce() {}

	@Override
	public void addSugar() {
		System.out.println("	Adding Sugar.");
	}

	@Override
	public String getDescription() {
		return "GreenTea";
	}

	@Override
	public double getCost() {
		return 25;
	}
	
}
