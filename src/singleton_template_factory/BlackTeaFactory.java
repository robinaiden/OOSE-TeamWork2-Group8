package singleton_template_factory;

public class BlackTeaFactory extends TeaFactory{
	
	private static BlackTeaFactory instance = null;
	
	private BlackTeaFactory() {
		System.out.println("Creating BlackTeaFactory...");
	}
	
	@Override
	protected TeaProduct CreateTea() {
		// TODO Auto-generated method stub
		return new BlackTeaProduct();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 20;
	}
	
	public static BlackTeaFactory getInstance() {
		if(instance == null) {
			instance = newInstance();
		}
		return instance;
	}
	
	private static BlackTeaFactory newInstance() {
		return new BlackTeaFactory();
	}
	
}
