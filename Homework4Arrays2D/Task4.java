import java.util.Scanner;

/*
 * Задача 4:
 * Имате двумерен масив от числа, чийто стойности са въведени 
 * предварително. Да се отпечатат сумата на елементите на масива, 
 * както и средноаритметичното на тези числа.
 * Да се състави програма, чрез която се извеждат стойностите на
 * елементите в двумерен масив след обръщането му на +90 градуса.
 */
public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете брой редове : ");
		int n = sc.nextInt();
		System.out.print("Въведете брой колони : ");
		int m = sc.nextInt();
		int[][] array = new int[n][m];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				System.out.print("Въведете стойност за ред " + row + " и колона " + col + " : ");
				array[row][col] = sc.nextInt();
			}
		}
		//int[][] array = { { 1, 2, 3, 4,	17 }, { 5, 6, 7, 8,18 }, { 9, 10, 11, 12,19 }, { 13, 14, 15, 16,20 }, };
		int[][] array2 = new int[array[0].length][array.length];
		for (int row = 0; row < array2.length; row++) {
			for (int col = 0; col < array2[0].length; col++) {
				array2[row][col] = array[array.length-col-1][row];
			}
		}
		
		for (int row = 0; row < array2.length; row++) {
			for (int col = 0; col < array2[0].length; col++) {
				System.out.print(array2[row][col]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
