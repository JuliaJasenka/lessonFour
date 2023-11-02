package edu.training.lesson4.main;

public class Task05 {

	public static void main(String[] args) {
		// Составить программу, которая определит площадь какого круга меньше.

		int r1 = 5;
		int r2 = 2;
		double s1 = Math.PI * Math.pow(r1, 2);
		double s2 = Math.PI * Math.pow(r2, 2);
		;

		if (s1 < s2) {
			System.out.println("Площадь круга c радиусом " + r1 + " меньше площади круга с радиусом " + r2 + ".");
		} else {
			if (s1 > s2) {
				System.out.println("Площадь круга c радиусом " + r2 + " меньше площади круга с радиусом " + r1 + ".");
			} else {
				System.out.println("Площади кругов равны.");

			}

		}

	}
}
