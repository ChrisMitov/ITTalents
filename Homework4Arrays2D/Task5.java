import java.util.Scanner;

/*
 * ������ 5:
 * �� �� ������� ��������, ��� ����� ������������� �� �������� 
 * ���������� ����� � �������� ����� 4*4 ��������.
 * ���������� �� ������� �������� �� ���������� ����� � �������������
 * �� ���-�������� ���� �� ������ ������ ���-�������� ���� �� ������.
 */
public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, };
		int[][] array = new int[4][4];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				System.out.print("�������� �������� �� ��� " + row + " � ������ " + col + " : ");
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
		System.out.println("���-�������� ���� �� ������ �: " + biggestSumRow);
		System.out.println("���-�������� ���� �� ������ �: " + biggestSumCol);
		if (biggestSumRow > biggestSumCol) {
			System.out.println("������������ ���� �� ������ � > �� ������������ ���� �� ������");
		} else if (biggestSumRow < biggestSumCol) {
			System.out.println("������������ ���� �� ������ � < �� ������������ ���� �� ������");
		} else {
			System.out.println("������������ ���� �� ������ � = �� ������������ ���� �� ������");
		}
		sc.close();
	}

}
