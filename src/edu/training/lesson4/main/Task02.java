package edu.training.lesson4.main;

public class Task02 {

	public static void main(String[] args) {
		// Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных
		// значениях a, b, c и х

		int a = -1;
		int b = 2;
		int c = 3;
		int x = -5;

		int z = a * x * x + b * x + c;
		if (z > 0) {
			System.out.println("модуль выражения равен " + z);
		} else {
			System.out.println("модуль выражения равен " + Math.abs(z));

		}
	}
}
