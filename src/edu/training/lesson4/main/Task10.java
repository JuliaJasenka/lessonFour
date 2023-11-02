package edu.training.lesson4.main;

public class Task10 {

	public static void main(String[] args) {
		// Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух
		// чисел заменить половиной их суммы, а большее — их удвоенным произведением.

		double x = 2;
		double y = 3;
		double newX;
		double newY;

		if (x < y) {
			newX = (x + y) / 2;
			newY = Math.pow(x * y, 2);
		} else {
			newX = Math.pow((x * y), 2);
			newY = (x + y) / 2;
		}

		System.out.println("Новое значение числа х = " + newX + ", числа у = " + newY + ".");
	}

}
