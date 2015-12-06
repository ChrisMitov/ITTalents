import java.util.Scanner;

/*
 * ������ 4:
 * ����� �������� ����� �� �����, ����� ��������� �� �������� 
 * �������������. �� �� ��������� ������ �� ���������� �� ������, 
 * ����� � ������������������� �� ���� �����.
 * �� �� ������� ��������, ���� ����� �� �������� ����������� ��
 * ���������� � �������� ����� ���� ���������� �� �� +90 �������.
 */
public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ���� ������ : ");
		int n = sc.nextInt();
		System.out.print("�������� ���� ������ : ");
		int m = sc.nextInt();
		int[][] array = new int[n][m];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				System.out.print("�������� �������� �� ��� " + row + " � ������ " + col + " : ");
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
