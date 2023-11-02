package edu.training.lesson4.main;

public class Task07 {

	public static void main(String[] args) {
		// Даны три действительных числа. Возвести в квадрат те из них, значения которых
		// неотрицательны, и в четвертую степень — отрицательные.

		double number1 = 2;
		double number2 = 3;
		double number3 = -4;

		if (number1 >= 0) {// 0 это положительное или отрицательное число?
			number1 = Math.pow(number1, 2);

			number3 = Math.pow(number3, 2);
		}
		if (number2 >= 0) {
			number2 = Math.pow(number2, 2);
		}
		if (number3 >= 0) {
			number3 = Math.pow(number3, 2);
		} else {
			number1 = Math.pow(number1, 4);
			number2 = Math.pow(number2, 4);
			number3 = Math.pow(number3, 4);
		}

		System.out.println("Новые значения переменных: number1 равно " + number1 + ";" + " number2 равно " + number2
				+ ";" + " number3 равно " + number3 + ";");

	}
}
