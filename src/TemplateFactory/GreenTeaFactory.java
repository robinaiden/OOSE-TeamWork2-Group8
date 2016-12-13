package TemplateFactory;

public class GreenTeaFactory extends TeaFactory{
	
	private static GreenTeaFactory instance = null;
	
	private GreenTeaFactory() {
		System.out.println("Creating GreenTeaFactory...");
	}
	
	@Override
	protected TeaProduct CreateTea() {
		// TODO Auto-generated method stub
		return new GreenTeaProduct();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 25;
	}
	
	public static GreenTeaFactory getInstance() {
		if(instance == null) {
			instance = newInstance();
		}
		return instance;
	}
	
	private static GreenTeaFactory newInstance() {
		return new GreenTeaFactory();
	}

}
