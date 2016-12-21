package test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import singleton_template_factory.BlackTeaFactory;

public class BlackTeaFactoryTest {
	
	@Test
	public void testGetInstance() {
		assertThat("The BlackTeaFactory has been created unsuccessfully.", BlackTeaFactory.getInstance(), notNullValue());
	}

}
