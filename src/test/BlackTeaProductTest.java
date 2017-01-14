package test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import singleton_template_factory.BlackTea;

public class BlackTeaProductTest {

	@Test
	public void testGetDescription() {
		assertThat(new BlackTea().getDescription(), is("BlackTea"));
	}

	@Test
	public void testGetCost() {
		assertThat(new BlackTea().getCost(), is(20.0));
	}

}
