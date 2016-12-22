package test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import decorator.PuddingDecorator;
import decorator.TeaComponent;
import singleton_template_factory.TeaFactory;

public class PuddingDecoratorTest {

	@Test
	public void testGetDescription() {
		TeaFactory teaFactory = TeaFactory.getInstance();
		TeaComponent aTea1 = teaFactory.createBlackTeaProduct();
		aTea1 = new PuddingDecorator(aTea1);
		assertThat(aTea1.getDescription(), is("BlackTea  Pudding"));
	}

	@Test
	public void testGetCost() {
		TeaFactory teaFactory = TeaFactory.getInstance();
		TeaComponent aTea1 = teaFactory.createBlackTeaProduct();
		aTea1 = new PuddingDecorator(aTea1);
		assertThat(aTea1.getCost(), is(25.0));
	}

}
