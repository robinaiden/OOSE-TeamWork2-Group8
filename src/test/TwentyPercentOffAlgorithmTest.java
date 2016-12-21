package test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import strategy.TwentyPercentOffAlgorithm;

public class TwentyPercentOffAlgorithmTest {

	@Test
	public void testDiscount() {
		assertThat("TwentyPercentOffAlgorithm calculation error.", new TwentyPercentOffAlgorithm().discount(100), is(80.0));
	}

}
