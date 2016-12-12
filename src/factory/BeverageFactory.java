package factory;

import coffee.BlackTea;
import coffee.Beverage;
import coffee.GreenTea;

public class BeverageFactory {
	public Beverage createBlackTea() {
		return new BlackTea();
	} 
	public Beverage createGreenTea() {
		return new GreenTea();
	}
}
