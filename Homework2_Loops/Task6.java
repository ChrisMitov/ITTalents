import java.util.Scanner;

/*
 * ������ 6: �� �� ������� ����� �� ������(���������) � �� ��
 * ������ ����� �� ������ ����� ����� 1 � ���������� �����.
 */
public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �����: ");
		int number = sc.nextInt();
		int sumOfNumbers = 0;
		if (number >= 1) {
			for (int index = 1; index <= number; index++) {
				sumOfNumbers += index;
			}
		} else {
			for (int index = number; index <= 1; index++) {
				sumOfNumbers += index;
			}
		}
		System.out.println("���������� �: " + sumOfNumbers);
		sc.close();
	}
}
