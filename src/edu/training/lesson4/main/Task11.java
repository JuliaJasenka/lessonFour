package edu.training.lesson4.main;

public class Task11 {

	public static void main(String[] args) {
		// Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и
		// тем же числом, равным большему из исходных, а если равны, то заменить числа
		// нулями.

		int m = 1;
		int n = 4;

		if (m == n) {
			m = 0;
			n = 0;
		}
		if (m < n) {
			m = n;
		} else {
			n = m;
		}
		System.out.println("Число m равно " + m + ", число n = " + n + ".");
	}

}
