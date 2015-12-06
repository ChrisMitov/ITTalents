import java.util.Scanner;

/*
 * ������ 10: �������� ����� �� ������������ � ���������� ���� �
 * ������. ������ ����� � ���� ����� �� ���� ���� �� 1 � �� ����
 * ��.
 */
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �����: ");
		int number = sc.nextInt();
		boolean isPrime = true;
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("������ �.");
		} else {
			System.out.println("�� � ������.");
		}
	}
}