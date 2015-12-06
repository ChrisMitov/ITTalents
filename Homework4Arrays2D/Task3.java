import java.util.Scanner;

/*
 * Задача 3:
 * Имате двумерен масив от числа, чийто 
 * стойности са въведени предварително. 
 * Да се отпечатат сумата на елементите на масива, 
 * както и средноаритметичното на тези числа.
 */
public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете брой редове : ");
		int n = sc.nextInt();
		System.out.print("Въведете брой колони : ");
		int m = sc.nextInt();
		int[][] array = new int[n][m];
		int sum = 0;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				System.out.print("Въведете стойност за ред " + row + " и колона " + col + " : ");
				array[row][col] = sc.nextInt();
				sum += array[row][col];
			}
		}
		System.out.println("Сумата на елементите в матрицата е: " + sum);
		float avg = (float) sum / (n * m);
		System.out.println("Средноаритметичното на числата в матрицата е: " + avg);
		sc.close();
	}
}
