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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 20;
	}

}
