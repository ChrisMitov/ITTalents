import java.util.Scanner;

/*
 * ������ 3:
 * �� �� ������ �����, ���� ����� �� �� ������� ����� � 10 
 * �������� �� ������� �����:
 * ������� 2 �������� �� ������ �� ���������� �����.
 * ����� ������� ������� �� ������ � ����� �� ����� �� 
 * ���������� 2 �������� � ������.
 * ���� ���� �������� ������.
 */

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �����: ");
		int number = sc.nextInt();
		int[] array = new int[10];
		// ��������� ������� 2 ��������.
		array[0] = number;
		array[1] = number;
		// ������������ ���������� ���� �� ������.
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		// ��������� ������.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		sc.close();
	}
}