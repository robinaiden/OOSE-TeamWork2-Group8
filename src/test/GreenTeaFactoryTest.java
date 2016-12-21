package test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.Test;

import singleton_template_factory.GreenTeaFactory;

public class GreenTeaFactoryTest {

	@Test
	public void testGetInstance() {
		assertThat("The GreenTeaFactory has been created unsuccessfully.", GreenTeaFactory.getInstance(), is(notNullValue()));
	}

}
