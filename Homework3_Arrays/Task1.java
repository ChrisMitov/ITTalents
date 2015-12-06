import java.util.Scanner;

/*
 * Задача 1:
 * Да се прочете масив и да се намери най-малкото число кратно на
 * 3 от масива.
 */
public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете размер на масива: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Въведете " + (i + 1) + "-тия елемент: ");
			array[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				if (min > array[i]) {
					min = array[i];
				}
			}
		}
		System.out.println("Най-малкото число кратно на 3 е" + min);
		sc.close();
	}
}