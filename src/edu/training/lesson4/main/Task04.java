package edu.training.lesson4.main;

public class Task04 {

	public static void main(String[] args) {
		// Составить программу нахождения наименьшего из квадратов двух чисел а и b.

		int a = 3;
		int b = 2;

		if ((Math.pow(a, 2)) < Math.pow(b, 2)) { // НУЖНО ЛИ БРАТЬ ФОРМУЛУ В СКОБКИ?
			System.out.println("наименьшим из квадратов двух чисел является квадрат числа a равный " + Math.pow(a, 2));
		} else {
			System.out.println("наименьшим из квадратов двух чисел является квадрат числа b равный " + Math.pow(b, 2));
		}

		// Составить программу, которая определит по трем введенным сторонам, является
		// ли данный треугольник равносторонним

		int cd = 5;// cd, df, fc стороны треугольника
		int df = 6;
		int fc = 5;

		if (cd == df && df == cd) { // КОДА ПРИМЕНЯЕТСЯ &, А КОГДА &&
			System.out.println("треугольник является равносторонним.");
		} else {
			System.out.println("треугольник не равносторонний.");
		}
	}

}
