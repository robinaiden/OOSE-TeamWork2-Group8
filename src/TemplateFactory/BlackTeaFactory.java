package TemplateFactory;

public class BlackTeaFactory extends TeaFactory{
	/*
	public BlackTeaFactory() {
		// TODO Auto-generated constructor stub
		System.out.println("This is BlackTea factory");
	}
	*/
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
	
}
