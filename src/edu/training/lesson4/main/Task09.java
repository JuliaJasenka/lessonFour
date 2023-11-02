package edu.training.lesson4.main;

public class Task09 {

	public static void main(String[] args) {
		// Даны два угла треугольника (в градусах). Определить, существует ли такой
		// треугольник, и если да, то будет ли он прямоугольным.

		int corner1 = 45;
		int corner2 = 45;
		int corner3 = 180 - corner1 - corner2;

		if (corner1 > 0 && corner2 > 0 && corner3 > 0) {
			System.out.println("Треугольник существует.");

			if (corner1 == 90 || corner2 == 90 || corner3 == 90) {
				System.out.println("Треугольник прямоугольный.");
			}
		} else {
			System.out.println("Треугольник не существует.");
		}
	}
}
