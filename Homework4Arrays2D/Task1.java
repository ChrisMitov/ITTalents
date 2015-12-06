import java.util.Scanner;

/*
 * ������ 1:
 * ����� �������� ����� 6�5 �� ���������� �����, 
 * ����� ��������� �� �������� �������������.
 * �� �� ������� ��������, ���� ����� �� �������� ���������� �� ������ 
 * � ���-������� � ���-�������� ��������.
 * ������:
 * 48,72,13,14,15
 * 21,22,53,24,75
 * 31,57,33,34,35
 * 41,95,43,44,45
 * 59,52,53,54,55
 * 61,69,63,64,65
 * �����: 
 * ���-����� 13; 
 * ���-������ 95
 */
public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[6][5];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				System.out.print("�������� �������� �� ��� " + row + " � ������ " + col + " : ");
				array[row][col] = sc.nextInt();
			}
		}
//		int[][] array = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 },
//				{ 41, 95, 43, 44, 45 }, { 59, 52, 53, 54, 55 }, { 61, 69, 63, 64, 65 } };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				if (array[row][col] > max) {
					max = array[row][col];
				}
				if (array[row][col] < min) {
					min = array[row][col];
				}
			}
		}
		System.out.println("����������� ������� �: " + min + "\n" + "������������ ������� �: " + max);
		sc.close();
	}
}