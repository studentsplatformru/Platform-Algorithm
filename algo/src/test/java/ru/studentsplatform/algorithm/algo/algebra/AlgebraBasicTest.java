package ru.studentsplatform.algorithm.algo.algebra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgebraBasicTest {
	/**
	 * Успешная отработка.
	 */
	@Test
	void gcdTest() {
		var a = 175;
		var b = 30;

		var result = AlgebraBasic.gcd(a, b);
		assertEquals(5L, result);
	}


	@Test
	void lcmTest() {
		var a = 3;
		var b = 8;

		var result = AlgebraBasic.lcm(a, b);
		assertEquals(24L, result);
	}

	@Test
	void binPowTest() {
		var a = 4;
		var n = 3;

		var result = AlgebraBasic.binPow(a, n);
		assertEquals(64L, result);
	}
}