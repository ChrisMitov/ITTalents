import java.util.Scanner;

/*
 * ������ 1:
 * �� �� ������� ����� � �� �� ������ ���-������� ����� ������ ��
 * 3 �� ������.
 */
public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������ �� ������: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("�������� " + (i + 1) + "-��� �������: ");
			array[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				if (min > array[i]) {
					min = array[i];
				}
			}
		}
		System.out.println("���-������� ����� ������ �� 3 �" + min);
		sc.close();
	}
}