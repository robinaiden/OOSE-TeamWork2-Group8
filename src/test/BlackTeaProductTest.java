package test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import singleton_template_factory.BlackTeaProduct;

public class BlackTeaProductTest {

	@Test
	public void testGetDescription() {
		assertThat(new BlackTeaProduct().getDescription(), is("BlackTea"));
	}

	@Test
	public void testGetCost() {
		assertThat(new BlackTeaProduct().getCost(), is(20.0));
	}

}
