import java.util.Scanner;

/*
 * ������ 9:
 * �������� ��������, � ����� ����������� ������� �����, ���� �����
 * ���������� �� ������ �� ������� � ������� ��� (����� �� � ������ ��
 * �� �������� � ������� ���, ��� ����� �� �� ������, ���� ����� �� ��
 * �������� � �������� ���). ��������� �� ������ �������� ����� � ����
 * ������������ ����� � ����� ��� �� ���������� ���� �����.
 */
public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ������� ���� ��������: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("�������� " + (i + 1) + "-��� �������: ");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		sc.close();
	}
}
