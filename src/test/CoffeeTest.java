package test;

import static org.junit.Assert.*;

import org.junit.Test;
import coffee.Beverage;
import factory.BeverageFactory;

public class CoffeeTest {

	@Test
	public void createLatteTest() {
		BeverageFactory coffeeFactory = new BeverageFactory();
		Beverage blackteaTest = coffeeFactory.createBlackTea();
		assertNotNull(blackteaTest);
	}
	
	@Test
	public void createMochaTest() {
		BeverageFactory coffeeFactory = new BeverageFactory();
		Beverage greenteaTest = coffeeFactory.createGreenTea();
		assertNotNull(greenteaTest);
	}

}
