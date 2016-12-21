package test;

import static org.junit.Assert.*;

import org.junit.Test;

import singleton_template_factory.GreenTeaFactory;

public class GreenTeaFactoryTest {

	@Test
	public void testGetInstance() {
		assertNotNull("The GreenTeaFactory has been created unsuccessfully.", GreenTeaFactory.getInstance());
	}

}
