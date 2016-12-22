package singleton_template_factory;

public class BlackTeaProduct extends TeaProduct {
	
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
		System.out.println("	Adding Sugar.");
	}

	@Override
	public String getDescription() {
		return "BlackTea";
	}

	@Override
	public double getCost() {
		return 20;
	}

}
