package calculatordev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calcitest {
	
		@Test
		public void calTest() {
			assertEquals(31, calci.add(11, 20));
		}

		@Test
		public void calTestSub() {
			assertEquals(30, calci.sub(50, 20));
		}

		@Test
		public void calcTestMul() {
			assertEquals(30, calci.mul(6, 5));
		}

		@Test
		public void calcTestDiv() {
			assertEquals(6, calci.div(30, 5));
		}

	}
	
