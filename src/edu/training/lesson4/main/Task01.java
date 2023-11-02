package edu.training.lesson4.main;

public class Task01 {

	public static void main(String[] args) {
		// Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на
		// экран цифру 7, в противном случае – цифру 8.

		int number1 = 3;
		int number2 = 2;

		if (number1 < number2) {
			System.out.println("7");
		} else {
			System.out.println("8");
		}

		// Составить программу сравнения двух чисел и 2. Если 1 меньше 2 – вывести на
		// экран слово «yes»,
		// в противном случае – слово «no»

		if (number1 < number2) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		// Составить программу сравнения введенного числа а и цифры 3. Вывести на экран
		// слово «yes»,если число а меньше 3; если больше, то вывести слово «no».

		int a = 1;
		int constant = 3;

		if (a < constant) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		// Составить программу: равны ли два числа а и b?

		int b = 5;

		if (a == b) {
			System.out.println("числа a и b равны");
		} else {
			System.out.println("числа a и b не равны");
		}

		// Составить программу: определения наименьшего из двух чисел а и b.

		if (a < b) {
			System.out.println("наименьшее из двух чисел - а равное " + a + ".");
		} else {                                                                   // НУЖНО ЛИ ПИСАТЬ ELSE ЗДЕСЬ?
			if (a > b) {
				System.out.println("наименьшее из двух чисел - b равное " + b + ".");
			} else {
				System.out.println("числа равны.");

			}

			// Составить программу: определения наибольшего из двух чисел а и b.

			if (a > b) {
				System.out.println("наибольшее из двух чисел - а равное " + a + ".");
			} else {
				if (a < b) {
					System.out.println("наибольшее из двух чисел - b равное " + b + ".");
				} else {
					System.out.println("числа равны.");
				}
			}

		}
	}
}
