import java.util.Scanner;
/*
 * ������ 11:
 * �� �� ������� ��������, ����� ������� �� ������������ 7 ���� �����
 * � ��������� �����
 * ���������� �� ������ ������ ����� ������ �� 5, �� �� ������ �� 5.
 * ������: -23, -55, 17, 75, 56, 105, 134
 * �����: 75,105, 2 �����
 */
public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� 7 �����: ");
		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 5 && array[i] % 5 == 0) {
				System.out.print(array[i] + ", ");
				k++;
			}
		}
		System.out.println(k + " �����");
		sc.close();
	}
}