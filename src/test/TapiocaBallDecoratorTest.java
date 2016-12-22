package test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import decorator.TapiocaBallDecorator;
import decorator.TeaComponent;
import singleton_template_factory.TeaFactory;

public class TapiocaBallDecoratorTest {

	@Test
	public void testGetDescription() {
		TeaFactory teaFactory = TeaFactory.getInstance();
		TeaComponent aTea1 = teaFactory.createBlackTeaProduct();
		aTea1 = new TapiocaBallDecorator(aTea1);
		assertThat(aTea1.getDescription(), is("BlackTea  TapiocaBall"));
	}

	@Test
	public void testGetCost() {
		TeaFactory teaFactory = TeaFactory.getInstance();
		TeaComponent aTea1 = teaFactory.createBlackTeaProduct();
		aTea1 = new TapiocaBallDecorator(aTea1);
		assertThat(aTea1.getCost(), is(25.0));
	}

}
