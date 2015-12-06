import java.util.Scanner;

/*
 * ������ 13:
 * �� �� ������� ��������, ���� ����� �� ������� ����� � �� ���������
 * ���� ����� � ������� ������ �������.
 * ����������, ���� �����, �� ��������� �������������� ������ �����
 * �� ���������� ���������� ����� � 2-���� ������ �������.
 * ������: 99
 * �����: 1100011
 */
public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �����: ");
		int number = sc.nextInt();
		int k = 0;
		int tmp = number;
		while (tmp > 0) {
			tmp /= 2;
			k++;
		}
		if (k == 0) {
			k = 1;
		}
		int[] array = new int[k];
		int i = 0;
		while (number > 0) {
			array[i] = number % 2;
			number /= 2;
			i++;
		}
		for (int index = 0; index < array.length / 2; index++) {
			int temp = array[index];
			array[index] = array[array.length - index - 1];
			array[array.length - index - 1] = temp;
		}
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j]);
		}
		sc.close();
	}
}