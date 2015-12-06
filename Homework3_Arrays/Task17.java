import java.util.Scanner;

/*
 * ������ 17:
 * ���� ������ �� ���������� ����� �� �������� �������������� ������,
 * ��� �� ���������� � �� ���������� ���������:
 * N1 < N2 > N3 < N4 > N5 <..
 * ��������� ��������, ����� ��������� ���� �������� � ���������
 * ����� ������ �� ����� ���������� ������� ����������.
 * ������: 1 3 2 4 3 7
 * �����: ��������� ������������ �� �������������� ������ ������
 */
public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ������� ���� ��������: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("�������� " + (i+1) + "-��� �������: ");
			array[i] = sc.nextInt();
		}
		boolean isCorrect = true;
		for (int index = 1; index < array.length-1; index++) {
			boolean isBiggerThanNeighbors = (array[index] > array[index+1]) && (array[index] > array[index-1]);
			boolean isLowerThanNeighbors = (array[index] < array[index+1]) && (array[index] < array[index-1]);
			
			if (!(isBiggerThanNeighbors || isLowerThanNeighbors)) {
				isCorrect = false;
				break;
			}
		}
		if (isCorrect) {
			System.out.println("��������� ������������ �� �������������� ������ ������");
		} else {
			System.out.println("�� ��������� ������������ �� �������������� ������ ������");
		}
		sc.close();
	}
}