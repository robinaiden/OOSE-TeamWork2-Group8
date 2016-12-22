package test;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.Test;

import singleton_template_factory.TeaFactory;


public class TeaFactoryTest {

	@Test
	public void testGetInstance() {
		assertThat("The TeaFactory has been created unsuccessfully.", TeaFactory.getInstance(), notNullValue());
	}

}
