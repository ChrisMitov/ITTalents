import java.util.Scanner;

/*
 * ������ 7:
 * �������� ��������, ����� ����� ���� ����� � ����� ������� ���
 * ����� ��� ����� ������ �� ������� �����: ���������� �� �����
 * ������� �� ������ ����� �� � ����� �� ����� �� ���������� �
 * ���������� ������� �� ���������� ������� �� ������ �����.
 * �� �� ������ ��������� �����.
 */
public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ������� �� ������: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int index = 0; index < array.length; index++) {
			System.out.print("�������� " + (index + 1) + "-��� �������: ");
			array[index] = sc.nextInt();
		}
		int[] finalArray = new int[n];
		// finalArray[0] = array[1] + array[array.length - 1];
		// finalArray[n - 1] = array[n - 2] + array[0];
		for (int index = 0; index < finalArray.length; index++) {
			if (index == 0) {
				finalArray[index] = array[index + 1] + array[array.length - 1];
			} else {
				if (index == finalArray.length - 1) {
					finalArray[index] = array[index - 1] + array[array.length - 1 - index];
				} else {
					finalArray[index] = array[index - 1] + array[index + 1];
				}
			}
		}
		for (int index = 0; index < finalArray.length; index++) {
			System.out.print("���������� ����� �: " + finalArray[index] + " ");
		}
		sc.close();
	}
}