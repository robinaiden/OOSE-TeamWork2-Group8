package TemplateFactory;

public class LemonTeaFactory extends TeaFactory{
	
	private static LemonTeaFactory instance = null;
	
	@Override
	protected TeaProduct CreateTea() {
		// TODO Auto-generated method stub
		return new LemonTeaProduct();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 30;
	}
	
	public static LemonTeaFactory getInstance() {
		if(instance == null) {
			instance = newInstance();
		}
		return instance;
	}
	
	private static LemonTeaFactory newInstance() {
		return new LemonTeaFactory();
	}

}
