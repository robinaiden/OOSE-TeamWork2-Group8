package test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import singleton_template_factory.LemonTeaProduct;

public class LemonTeaProductTest {

	@Test
	public void testGetDescription() {
		assertThat(new LemonTeaProduct().getDescription(), is("LemonTea"));
	}

	@Test
	public void testGetCost() {
		assertThat(new LemonTeaProduct().getCost(), is(30.0));
	}

}
