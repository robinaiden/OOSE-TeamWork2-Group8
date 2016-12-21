package test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.Test;

import singleton_template_factory.LemonTeaFactory;

public class LemonTeaFactoryTest {

	@Test
	public void testGetInstance() {
		assertThat("The LemonTeaFactory has been created unsuccessfully.", LemonTeaFactory.getInstance(), is(notNullValue()));
	}

}
