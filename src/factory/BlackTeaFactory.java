package factory;

import tea.BlackTea;
import tea.TeaProduct;

public class BlackTeaFactory implements TeaFactory {

	@Override
	public TeaProduct createTea() {
		return new BlackTea();
	}

}
