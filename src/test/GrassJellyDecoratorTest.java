package test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import decorator.GrassJellyDecorator;
import decorator.TeaComponent;
import singleton_template_factory.BlackTeaFactory;
import singleton_template_factory.TeaFactory;

public class GrassJellyDecoratorTest {

	@Test
	public void testGetDescription() {
		TeaFactory teafactory1 = BlackTeaFactory.getInstance();
		TeaComponent aTea1 = teafactory1.teaRecipe();
		aTea1 = new GrassJellyDecorator(aTea1);
		assertThat(aTea1.getDescription(), is("BlackTea  GrassJelly"));
	}

	@Test
	public void testGetCost() {
		TeaFactory teafactory1 = BlackTeaFactory.getInstance();
		TeaComponent aTea1 = teafactory1.teaRecipe();
		aTea1 = new GrassJellyDecorator(aTea1);
		assertThat(aTea1.getCost(), is(25.0));
	}
	
}
