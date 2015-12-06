import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * ������ 16:
 * �� �� ������� ��������, ���� ����� ������������� �������� 10
 * ������ ����� �� ��������� �� ���������� �� ������� �����:
 * 1. ������� �������������� �����.
 * 2. ������ �������� ��� �������� ��-����� �� -0.231 �� ������� ���
 * ������ �� �������� �� ������� �� + ������� 41.25, � ������ ��������
 * �������� �� ������� � �������������� ����� ����� ������� �
 * �������� ������� �����
 * 3. �� �� ������� ���������� �� �������� � ��������������� �����.
 * 4. �� �� ������� �������� �������� �� ������ �������� �� ������
 * ������, ����� �� �������� �� 0.
 * ������: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
 * �����: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25
 */
public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���������� ���������� ���� ������ ����, ������ �� ��������� ����� �
		// ����� ����� ���� ���������.
		DecimalFormat df = new DecimalFormat("#.##");
		// double[] array = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4};
		double[] array = new double[10];
		for (int i = 0; i < array.length; i++) {
			System.out.print("�������� " + (i + 1) + "-��� �������: ");
			array[i] = sc.nextDouble();
		}
		// 1. ������� �������������� �����.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// 2. ������ �������� ��� �������� ��-����� �� -0.231 �� ������� ���
		// ������ �� �������� �� ������� �� + ������� 41.25, � ������ ��������
		// �������� �� ������� � �������������� ����� ����� ������� � ��������
		// ������� �����
		double[] secondArray = new double[array.length];
		for (int i = 0; i < secondArray.length; i++) {
			if (array[i] < (-0.231)) {
				secondArray[i] = Math.pow((i + 1), 2) + 41.25;
			} else {
				secondArray[i] = array[i] * (i + 1);
			}
		}
		System.out.println();
		// 3. �� �� ������� ���������� �� �������� � ��������������� �����.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		double sum = 0;
		int k = 0;
		System.out.println();
		for (int i = 0; i < secondArray.length; i++) {
			System.out.print(df.format(secondArray[i]) + " ");
			if (secondArray[i] != 0) {
				sum += secondArray[i];
				k++;
			}
		}
		// 4. �� �� ������� �������� �������� �� ������ �������� �� ������
		// ������, ����� �� �������� �� 0.
		System.out.println('\n' + "������ �:" + df.format(sum / k));
		sc.close();
	}
}