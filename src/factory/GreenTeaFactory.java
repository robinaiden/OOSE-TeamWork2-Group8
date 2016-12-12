package factory;

import tea.GreenTea;
import tea.TeaProduct;

public class GreenTeaFactory implements TeaFactory {

	@Override
	public TeaProduct createTea() {
		return new GreenTea();
	}

}
