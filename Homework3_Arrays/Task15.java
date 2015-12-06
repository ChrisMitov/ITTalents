import java.util.Scanner;

/*
 * ������ 15:
 * �� �� ������� ��������, ����� ������� � ��������� ����� ������ �����.
 * ���� �����: �������� ������� ����� 3 �������� �����, �����
 * ��������� �������� ������� ������������ ���� ����.
 * ������: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
 * �����: 5.1; 6.34; 7.13
 */
public class Task15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������ �� ������: ");
		int n = sc.nextInt();
		double[] array = new double[n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("�������� " + (i + 1) + "-��� �������: ");
			array[i] = sc.nextDouble();
		}
		//double[] array = { -90.2, 0.1, -7.13, -5.1, 6.34, 1.12 };
		double firstLargest = Integer.MIN_VALUE;
		double secondLargest = Integer.MIN_VALUE;
		double thirdLargest = Integer.MIN_VALUE;
		int indexFirst = 0, indexSecond = 0, indexThird = 0;
		for (int i = 0; i < array.length; i++) {
			double helper = Math.abs(array[i]);
			if (helper > firstLargest) {
				thirdLargest = secondLargest;
				secondLargest = firstLargest;
				firstLargest = helper;
				indexThird = indexSecond;
				indexSecond = indexFirst;
				indexFirst = i;
			} else if (helper > secondLargest) {
				thirdLargest = secondLargest;
				secondLargest = helper;
				indexThird = indexSecond;
				indexSecond = i;
			} else if (helper > thirdLargest) {
				thirdLargest = helper;
				indexThird = i;
			}
		}
		System.out.println("----------");
		System.out.println(array[indexThird] + " " + array[indexSecond] + " " + array[indexFirst]);
		sc.close();
	}
}