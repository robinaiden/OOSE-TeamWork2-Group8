package singleton_template_factory;

public class LemonTeaFactory extends TeaFactory{
	
	private static LemonTeaFactory lemonTeaFactory = new LemonTeaFactory();
	public boolean customerWantsSugar() { return false; }
	
	private LemonTeaFactory() {
		
	}
	
	@Override
	protected TeaProduct CreateTea() {
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
	
	public static LemonTeaFactory getInstance() {
		return lemonTeaFactory;
	}

}
