package calculatordev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class jtester {

	@Test
	public void calTest() {
		assertEquals(31, calcidev.add(11, 20));
	}

	@Test
	public void calTestSub() {
		assertEquals(30, calcidev.sub(50, 20));
	}

	@Test
	public void calcTestMul() {
		assertEquals(30, calcidev.mul(6, 5));
	}

	@Test
	public void calcTestDiv() {
		assertEquals(6, calcidev.div(30, 5));
	}

}