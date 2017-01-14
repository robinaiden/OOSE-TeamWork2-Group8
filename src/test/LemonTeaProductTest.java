package test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import singleton_template_factory.LemonTea;

public class LemonTeaProductTest {

	@Test
	public void testGetDescription() {
		assertThat(new LemonTea().getDescription(), is("LemonTea"));
	}

	@Test
	public void testGetCost() {
		assertThat(new LemonTea().getCost(), is(30.0));
	}

}
