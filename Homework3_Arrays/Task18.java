import java.util.Scanner;

/*
 * ������ 18:
 * ������ �� ��� ��������� ������ � ���������� �����.
 * �� �� ������� ��������, ����� �������� ������ ����� � �������
 * ������� �� ����� ������ � ������� � ����� �����, ��-�������� ��
 * ����� �����.
 * �� �� ������ ������������ � �� ����� ������
 * ������:
 * 18,19,32,1,3, 4, 5, 6, 7, 8
 * 1, 2, 3,4,5,16,17,18,27,11
 * �����: 
 * 18,19,32 ,4,5,16,17,18,27,11
 */

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ������� �� ������ �����: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("�������� " + (i + 1) + "-��� �������: ");
			array[i] = sc.nextInt();
		}
		System.out.print("�������� ������� �� ������ �����: ");
		int m = sc.nextInt();
		int[] array2 = new int[m];
		for (int i = 0; i < array2.length; i++) {
			System.out.print("�������� " + (i + 1) + "-��� �������: ");
			array2[i] = sc.nextInt();
		}
		int[] finalArray = new int[n];
//		int[] array = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
//		int[] array2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
//		int[] finalArray = new int[array.length];
		if (array.length != array2.length) {
			System.out.println("�������� �� � �������� �������!");
		} else {
			for (int index = 0; index < array.length; index++) {
				if (array[index] >= array2[index]) {
					finalArray[index] = array[index];
				} else {
					finalArray[index] = array2[index];
				}
			}
		}
		System.out.println("������� ����� �:");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		System.out.println('\n' + "������� ����� �:");
		for (int index = 0; index < array2.length; index++) {
			System.out.print(array2[index] + " ");
		}
		System.out.println('\n' + "�������� ����� �: ");
		for (int index = 0; index < finalArray.length; index++) {
			System.out.print(finalArray[index] + " ");
		}
		sc.close();
	}
}