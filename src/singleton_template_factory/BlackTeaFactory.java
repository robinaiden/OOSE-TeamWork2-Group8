package singleton_template_factory;

public class BlackTeaFactory extends TeaFactory{
	
	private static BlackTeaFactory blackTeaFactory = new BlackTeaFactory();
	
	private BlackTeaFactory() {
		
	}
	
	@Override
	protected TeaProduct CreateTea() {
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

	public static BlackTeaFactory getInstance() {
		return blackTeaFactory;
	}
	
}
