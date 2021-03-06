package test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import singleton_template_factory.GreenTeaProduct;

public class GreenTeaProductTest {

	@Test
	public void testGetDescription() {
		assertThat(new GreenTeaProduct().getDescription(), is("GreenTea"));
	}

	@Test
	public void testGetCost() {
		assertThat(new GreenTeaProduct().getCost(), is(25.0));
	}

}
