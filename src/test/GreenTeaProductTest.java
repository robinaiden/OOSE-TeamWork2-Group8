package test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import singleton_template_factory.GreenTea;

public class GreenTeaProductTest {

	@Test
	public void testGetDescription() {
		assertThat(new GreenTea().getDescription(), is("GreenTea"));
	}

	@Test
	public void testGetCost() {
		assertThat(new GreenTea().getCost(), is(25.0));
	}

}
