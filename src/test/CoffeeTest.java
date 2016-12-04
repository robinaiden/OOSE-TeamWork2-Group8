package test;

import static org.junit.Assert.*;

import org.junit.Test;
import coffee.Coffee;
import factory.CoffeeFactory;

public class CoffeeTest {

	@Test
	public void createLatteTest() {
		Coffee latteTest = CoffeeFactory.createLatte();
		assertNotNull(latteTest);
	}
	
	@Test
	public void createMochaTest() {
		Coffee mochaTest = CoffeeFactory.createMocha();
		assertNotNull(mochaTest);
	}
	
	@Test
	public void createCappuccinoTest() {
		Coffee cappuccinoTest = CoffeeFactory.createCappuccino();
		assertNotNull(cappuccinoTest);
	}

}
