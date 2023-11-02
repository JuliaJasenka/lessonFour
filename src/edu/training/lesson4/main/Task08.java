package edu.training.lesson4.main;

public class Task08 {

	public static void main(String[] args) {
		// Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
		// которая из точек находится ближе к началу координат.
		// A = √x1^2+y2^2 - формула растояния от точки до начала координат

		int x1 = 2;
		int x2 = 2;
		int y1 = 2;
		int y2 = 2;

		double lenght1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		double lenght2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

		if (lenght1 < lenght2) {
			System.out.println("Точка A с координатами (" + x1 + "," + y1 + ") "
					+ "лежит ближе к началу координат, чем точка В с координатами (" + x2 + "," + y2 + ").");
		}
		if (lenght1 > lenght2) {
			System.out.println("Точка B с координатами (" + x2 + "," + y2 + ") "
					+ "лежит ближе к началу координат, чем точка В с координатами (" + x1 + "," + y1 + ").");
		} else {
			System.out.println("Точки равноудалены от начала координат.");
		}
	}
}
