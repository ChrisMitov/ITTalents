import java.util.Scanner;

/*
 * Задача 4:
 * Да се прочете масив и да се отпечата дали е огледален.
 * Следните масиви са огледални:
 * [3 7 7 3]
 * [4]
 * [1 55 1]
 * [6 27 -1 5 7 7 5 -1 27 6]
 */
public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете размер на масива: ");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("Некоректни данни!");
			return;
		}
		int[] array = new int[n];
		// Въвеждаме елементите.
		for (int i = 0; i < array.length; i++) {
			System.out.print("Въведете " + (i + 1) + "-тия елемент: ");
			array[i] = sc.nextInt();
		}
		boolean isCorrect = true;
		// Проверка дали има двойка елементи, които не са еднакви.
		for (int i = 0; i < array.length; i++) {
			if (array[i] != array[array.length - i - 1]) {
				isCorrect = false;
			}
		}
		if (isCorrect) {
			System.out.println("Огледален е!");
		} else {
			System.out.println("Не е огледален");
		}
		sc.close();
	}
}