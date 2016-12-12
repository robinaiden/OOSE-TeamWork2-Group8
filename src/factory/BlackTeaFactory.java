package factory;

import tea.BlackTea;
import tea.TeaProduct;

public class BlackTeaFactory implements TeaFactory {
	
	private static BlackTeaFactory instance = new BlackTeaFactory();
	
	private BlackTeaFactory() {
		System.out.println("Creating...");
	}

	@Override
	public TeaProduct createTea() {
		return new BlackTea();
	}
	
	public static BlackTeaFactory getInstance() {
		return instance;
	}

}
