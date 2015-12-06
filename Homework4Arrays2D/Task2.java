import java.util.Scanner;

/*
 * Задача 2:
 * Имате квадратен двумерен масив от естествени числа, 
 * чийто стойности се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
 * Пример:
 * 1,4,6,3
 * 5,9,7,2
 * 4,8,1,9
 * 2,3,4,5
 * Изход: 
 * 1 9 1 5
 * 3 7 8 2
 */
public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете размерност на матрицата: ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array.length; col++) {
				System.out.print("Въведете стойност за ред " + row + " и колона " + col + " : ");
				array[row][col] = sc.nextInt();
			}
		}
		// int[][] array = { { 1, 4, 6, 3 }, { 5, 9, 7, 2 }, { 4, 8, 1, 9 }, {
		// 2, 3, 4, 5 }, };
		// Отпечатваме главния диагонал.
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array.length; col++) {
				if (row == col) {
					System.out.print(array[row][col] + " ");
				}
			}
		}
		System.out.println();
		// Отпечатваме вторичния диагонал.
		for (int row = 0; row < array.length; row++) {
			System.out.print(array[row][array.length - row - 1] + " ");
		}
		sc.close();
	}

}
