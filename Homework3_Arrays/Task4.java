import java.util.Scanner;

/*
 * ������ 4:
 * �� �� ������� ����� � �� �� �������� ���� � ���������.
 * �������� ������ �� ���������:
 * [3 7 7 3]
 * [4]
 * [1 55 1]
 * [6 27 -1 5 7 7 5 -1 27 6]
 */
public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������ �� ������: ");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("���������� �����!");
			return;
		}
		int[] array = new int[n];
		// ��������� ����������.
		for (int i = 0; i < array.length; i++) {
			System.out.print("�������� " + (i + 1) + "-��� �������: ");
			array[i] = sc.nextInt();
		}
		boolean isCorrect = true;
		// �������� ���� ��� ������ ��������, ����� �� �� �������.
		for (int i = 0; i < array.length; i++) {
			if (array[i] != array[array.length - i - 1]) {
				isCorrect = false;
			}
		}
		if (isCorrect) {
			System.out.println("��������� �!");
		} else {
			System.out.println("�� � ���������");
		}
		sc.close();
	}
}