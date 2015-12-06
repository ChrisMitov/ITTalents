import java.util.Scanner;

/*
 * ������ 10:
 * �� �� ������� ��������, ���� ����� �� �������� 7 ���� ����� �
 * ��������� �����.
 * ���������� �� ������ �������, ����� � ���-������ �� ��������
 * �������� �� ���������� �����.
 * ������: 1,2,3,4,5,6,7
 * �����: ������ �������� 4, ���-������ �������� 4
 */
public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ������� ���� ��������: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print("�������� " + (i + 1) + "-��� �������: ");
			array[i] = sc.nextInt();
			sum += array[i];
		}
		double avg = sum / array.length; // ������ ��������
		System.out.println("������ ��������: " + avg);
		double[] minDifference = new double[array.length];
		for (int i = 0; i < minDifference.length; i++) {
			double sub = array[i] - avg;
			minDifference[i] = Math.abs(sub);
		}
		double min = minDifference[0];
		int minIndex = 0;
		for (int i = 1; i < minDifference.length; i++) {
			if (min > minDifference[i]) {
				min = minDifference[i];
				minIndex = i;
			}
		}
		System.out.println("������� ���-������ �� ���� ��������:" + array[minIndex]);
		sc.close();
	}

}
