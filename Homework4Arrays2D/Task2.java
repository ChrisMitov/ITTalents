import java.util.Scanner;

/*
 * ������ 2:
 * ����� ��������� �������� ����� �� ���������� �����, 
 * ����� ��������� �� �������� �� ���������. �� �� ��������� ����������� �� ������.
 * ������:
 * 1,4,6,3
 * 5,9,7,2
 * 4,8,1,9
 * 2,3,4,5
 * �����: 
 * 1 9 1 5
 * 3 7 8 2
 */
public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ���������� �� ���������: ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array.length; col++) {
				System.out.print("�������� �������� �� ��� " + row + " � ������ " + col + " : ");
				array[row][col] = sc.nextInt();
			}
		}
		// int[][] array = { { 1, 4, 6, 3 }, { 5, 9, 7, 2 }, { 4, 8, 1, 9 }, {
		// 2, 3, 4, 5 }, };
		// ����������� ������� ��������.
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array.length; col++) {
				if (row == col) {
					System.out.print(array[row][col] + " ");
				}
			}
		}
		System.out.println();
		// ����������� ��������� ��������.
		for (int row = 0; row < array.length; row++) {
			System.out.print(array[row][array.length - row - 1] + " ");
		}
		sc.close();
	}

}
