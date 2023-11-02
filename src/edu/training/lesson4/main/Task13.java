package edu.training.lesson4.main;

public class Task13 {

	public static void main(String[] args) {
		// Определить, делителем каких чисел а, b, с является число k.

		int a = 26;
		int b = 13;
		int c = 24;
		int k = 11;

		if (k != 0) {

			if (a % k == 0) {
				System.out.println("Число " + k + " является делителем числа " + a);
			}
			if (b % k == 0) {
				System.out.println("Число " + k + " является делителем числа " + b);
			}
			if (c % k == 0) {
				System.out.println("Число " + k + " является делителем числа " + c);
			}

		} else {
			System.out.println("k равен нулю.Делить на ноль нельзя!");
		}
	}                       // КАК ПРОПИСАТЬ УСЛОВИЕ, ЧТО ЧИСЛО К НЕ ЯВЛЯЕТСЯ ДЕЛИТЕЛЕМ НИ ОДНОГО ЧИСЛА (ОБЩЕЕ)
}
