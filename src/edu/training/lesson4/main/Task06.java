package edu.training.lesson4.main;

public class Task06 {

	public static void main(String[] args) {
		/// Составить программу, которая определит площадь какого треугольника больше.

		int a1 = 6;
		int b1 = 3;
		int c1 = 4;
		int a2 = 2;
		int b2 = 5;
		int c2 = 4;

		int p1 = a1 + b1 + c1;
		int p2 = a2 + b2 + c2;

		double s1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
		double s2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));

		if (s1 < s2) {
			System.out.println("Площадь треугольника со сторонами " + a1 + "x" + b1 + "x" + c1
					+ " меньше площади треугольника со сторонами " + a2 + "x" + b2 + "x" + c2 + ".");
		}
		if (s1 > s2) {
			System.out.println("Площадь треугольника со сторонами " + a2 + "x" + b2 + "x" + c2
					+ " меньше площади треугольника со сторонами " + a1 + "x" + b1 + "x" + c1 + ".");
		} else {
			System.out.println("Площади треугольников равны.");

		}
	}

}
