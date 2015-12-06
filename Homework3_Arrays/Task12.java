import java.util.Scanner;

/*
 * ������ 12:
 * �� �� ������� ��������, ���� ����� �� ������������� �������� 7
 * ����� � ��������� ����� �� �������� ������� �� �������� � �������:
 * - 0 � 1 ���� ����� ����������;
 * - 2 � 3 ���� ��������;
 * - 4 � 5 ���� ���������.
 * ������: 1,2,3,4,5,6,7
 * �����: 2,1,4,3,6,5,7
 */
public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� 7 �����: ");
		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		// ������� �� 0 � 1 ���� ����� ����������;
		int tmp = array[0];
		array[0] = array[1];
		array[1] = tmp;
		// ������� �� 2 � 3 �� ���� ��������;
		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];
		// ������� �� 4 � 5 �� ���� ���������;
		array[4] = array[4] * array[5];
		array[5] = array[4] / array[5];
		array[4] = array[4] / array[5];

		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				System.out.print(array[i] + ",");
			} else {
				System.out.println(array[i]);
			}

		}
		sc.close();
	}
}
