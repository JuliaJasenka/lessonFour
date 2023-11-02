package edu.training.lesson4.main;

public class Task12 {

	public static void main(String[] args) {
		// Подсчитать количество отрицательных среди чисел а, b, с.
		// Подсчитать количество положительных среди чисел а, b, с.

		int a = 1;
		int b = 2;
		int c = -3;
		int count = 0;
		int count1 = 0;

		if (a < 0) {
			count++;
		} else {
			count1++;
		}
		if (b < 0) {
			count++;
		} else {
			count1++;
		}
		if (c < 0) {
			count++;
		} else {
			count1++;
		}
		System.out
				.println("Количество отрицательных чисел = " + count + ", количество положительных чисел = " + count1);

	}

}
