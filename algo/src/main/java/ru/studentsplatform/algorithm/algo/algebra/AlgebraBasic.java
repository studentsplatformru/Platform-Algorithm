package ru.studentsplatform.algorithm.algo.algebra;

/**
 * Элементарные алгоритмы по Алгебре.
 *
 * @author Krylov Sergey (08.10.2020)
 */
public class AlgebraBasic {
	private AlgebraBasic() {
	}

	/**
	 * Алгоритм Евклида нахождения НОД (наибольшего общего делителя).
	 *
	 * @param a первое число
	 * @param b второе число
	 * @return НОД
	 */
	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	/**
	 * НОК (наименьшее общее кратное).
	 *
	 * @param a первое число
	 * @param b второе число
	 * @return НОД
	 */
	public static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}

	/**
	 * Быстрое возведение в степень.
	 * @param a число
	 * @param n степень
	 * @return результат
	 */
	public static long binPow(long a, long n) {
		int res = 1;
		while (n != 0) {
			if ((n & 1) == 1)
				res *= a;
			a *= a;
			n >>= 1;
		}
		return res;
	}
}
