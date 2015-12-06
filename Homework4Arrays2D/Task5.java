import java.util.Scanner;

/*
 * Задача 5:
 * Да се състави програма, при която предварително са въведени 
 * естествени числа в двумерен масив 4*4 елемента.
 * Програмата да извежда резултат от проверката какво е съотношението
 * на най-голямата сума по редове спрямо най-голямата сума по колони.
 */
public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, };
		int[][] array = new int[4][4];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				System.out.print("Въведете стойност за ред " + row + " и колона " + col + " : ");
				array[row][col] = sc.nextInt();
			}
		}
		int biggestSumRow = 0;
		int biggestSumCol = 0;
		for (int row = 0; row < array.length; row++) {
			int sumRow = 0;
			int sumCol = 0;
			for (int col = 0; col < array.length; col++) {
				sumRow += array[row][col];
				sumCol += array[col][row];
			}
			if (sumRow > biggestSumRow) {
				biggestSumRow = sumRow;
			}
			if (sumCol > biggestSumCol) {
				biggestSumCol = sumCol;
			}
		}
		System.out.println("Най-голямата сума по редове е: " + biggestSumRow);
		System.out.println("Най-голямата сума по колони е: " + biggestSumCol);
		if (biggestSumRow > biggestSumCol) {
			System.out.println("Максималната сума по редове е > от максималната сума по колони");
		} else if (biggestSumRow < biggestSumCol) {
			System.out.println("Максималната сума по редове е < от максималната сума по колони");
		} else {
			System.out.println("Максималната сума по редове е = на максималната сума по колони");
		}
		sc.close();
	}

}
