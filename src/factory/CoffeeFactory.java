package factory;

import coffee.Cappuccino;
import coffee.Coffee;
import coffee.Latte;
import coffee.Mocha;

public class CoffeeFactory {
	public static Coffee createLatte() {
		return new Latte();
	} 
	public static Coffee createMocha() {
		return new Mocha();
	}
	public static Coffee createCappuccino() {
		return new Cappuccino();
	}
}
