package singleton_template_factory;

public class BlackTeaProduct extends TeaProduct{
	
	public void brew(){
		System.out.println("	Brew Black Tea Bag.");
	}
	
	public void addIce(){
		System.out.println("	Adding Ice.");
	}
	
	public void addSugar(){
		System.out.println("	Adding Suger.");
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
