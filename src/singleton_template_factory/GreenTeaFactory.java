package singleton_template_factory;

public class GreenTeaFactory extends TeaFactory{
	
	private static GreenTeaFactory greenTeaFactory = new GreenTeaFactory();
	public boolean customerWantsIce() { return false; }
	
	private GreenTeaFactory() {
		
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
	
	public static GreenTeaFactory getInstance() {
		return greenTeaFactory;
	}

}
