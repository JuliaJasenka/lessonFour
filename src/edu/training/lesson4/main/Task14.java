package edu.training.lesson4.main;

public class Task14 {

	public static void main(String[] args) {
		// На плоскости ХОY задана своими координатами точка А. Указать, где она
		// расположена (на какой оси или в каком координатном угле)

		// координаты точки А (x,y)

		int x = 0;
		int y = 5;

		if (x > 0 && y > 0) {
			System.out.println(
					"Точка А с координатами (" + x + "," + y + ") находится в первой четверти координатной плоскости.");
		}
		if (x < 0 && y > 0) {
			System.out.println("Точка А с координатами (" + x + "," + y
					+ ") находится во второй четверти координатной плоскости.");
		}
		if (x < 0 && y < 0) {
			System.out.println("Точка А с координатами (" + x + "," + y
					+ ") находится в третьей четверти координатной плоскости.");
		}
		if (x > 0 && y < 0) {
			System.out.println("Точка А с координатами (" + x + "," + y
					+ ") находится в четвертой четверти координатной плоскости.");
		}
		if (x == 0 && y != 0) {
			System.out.println("Точка А с координатами (" + x + "," + y + ") лежит на оси ординат.");
		}
		if (x != 0 && y == 0) {
			System.out.println("Точка А с координатами (" + x + "," + y + ") лежит на оси абсцисс.");
		}
		if (x == 0 && y == 0) {
			System.out.println("Точка А с координатами (" + x + "," + y + ") - начало координат.");
		}
	}

}