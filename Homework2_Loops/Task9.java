import java.util.Scanner;

/*
 * ������ 9: �� �� �������� 2 ����� �� ������������ � � �.
 * �� �� ������� ������ ����� �� � �� � �� ������ 2(��������� �
 * �������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� ��
 * ������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
 * ������������) ����� ��-������ �� 200, �� �� �������� �����������.
 */
public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �: ");
		int firstNumber = sc.nextInt();
		System.out.print("�������� B: ");
		int secondNumber = sc.nextInt();
		int sum = 0;
		// ��� �>�.
		if (firstNumber > secondNumber) {
			int tmp = firstNumber;
			firstNumber = secondNumber;
			secondNumber = tmp;
		}
		for (int i = firstNumber; i <= secondNumber; i++) {
			if (i % 3 == 0) {
				System.out.print("skip 3, ");
			} else {
				if (sum > 200) {
					break;
				} else {
					System.out.print(Math.pow(i, 2) + ", ");
					sum += Math.pow(i, 2);
				}
			}
		}
	}
}
