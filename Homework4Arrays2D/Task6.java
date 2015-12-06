import java.util.Scanner;

/*
 * Задача 6:
 * Имате предварително въведени стойности от естествени числа. 
 * Числата са въведени в квадратна таблица с размери 6 реда и 6 
 * колони.
 * Да се състави програма, чрез която се намира сумата на всички 
 * елементи от редовете с четни номера: 2,4 и 6.
 * Програмата да извежда и сумата на всеки отделен ред.
 * Пример:
 * 11,12,13,14,15,16,
 * 21,22,23,24,25,26, //2ри ред
 * 31,32,33,34,35,36,
 * 41,42,43,44,45,46, //4ти ред
 * 51,52,53,54,55,56,
 * 61,62,63,64,65,66  //6ти ред
 * Изход:
 * 21,22,23,24,25,26 сума 141
 * 41,42,43,44,45,46 сума 261
 * 61,62,63,64,65,66 сума 381
 * Сума на елементите 783
 */
public class Task6 {

	public static void main(String[] args) {
//		int[][] array = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
//				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[4][4];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				System.out.print("Въведете стойност за ред " + row + " и колона " + col + " : ");
				array[row][col] = sc.nextInt();
			}
		}
		int sumEvenRows = 0;
		for (int row = 1; row < array.length; row += 2) {
			int sumRow = 0;
			for (int col = 0; col < array.length; col++) {
				System.out.print(array[row][col] + " ");
				sumRow += array[row][col];
			}
			sumEvenRows += sumRow;
			System.out.print("сума " + sumRow);
			System.out.println();
		}
		System.out.println("Сума на елементите " + sumEvenRows);
		sc.close();
	}

}
