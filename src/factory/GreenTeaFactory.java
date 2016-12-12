package factory;

import tea.GreenTea;
import tea.TeaProduct;

public class GreenTeaFactory implements TeaFactory {
	
	private static GreenTeaFactory instance = new GreenTeaFactory();

	@Override
	public TeaProduct createTea() {
		return new GreenTea();
	}
	
	public static GreenTeaFactory getInstance() {
		return instance;
	}

}
