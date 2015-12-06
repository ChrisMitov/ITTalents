import java.util.Scanner;

/*
 * ������ 6:
 * �������� ��������, ����� ����� ���� 2 ������ � ����� �������
 * ��������� ���� �� �������, � ���� �� � ������� ������.
 */
public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������ �� ������: ");
		int number = sc.nextInt();
		System.out.println("�������� ������ �� ������: ");
		int nextNumber = sc.nextInt();
		int[] array = new int[number];
		int[] array2 = new int[nextNumber];
		for (int i = 0; i < array.length; i++) {
			System.out.print("�������� " + (i + 1) + "-��� �������: ");
			array[i] = sc.nextInt();
		}
		System.out.println("������� �����: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print("�������� " + (i + 1) + "-��� �������: ");
			array2[i] = sc.nextInt();
		}
		boolean isCorrect = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != array2[i]) {
				isCorrect = false;
				break;
			}
		}
		// �� �� �� ������� ������ �� �� � ������� ������� :)
		if (isCorrect && array.length == array2.length) {
			System.out.println("������� �� � �� � ������� �������");
		} else {
			System.out.println("�� �� ������� �� ��� � ������� �������");
		}
		sc.close();
	}

}
