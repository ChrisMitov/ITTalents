import java.util.Scanner;

/*
 * ������ 19: �� �� ������� ��������, ���� ����� �� ��������
 * ���������� ����� �� ��������� [10..99] �� ������� ��������
 * �����, ��� �������� �� �������� ����������:
 * 1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
 * 2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
 * ����������� ���������� ������ �� �� ������ �������� 1.
 * ������: 11
 * �����: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.
 */
public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �����: ");
		int number = sc.nextInt();
		if (number >= 10 && number <= 99) {
			do {
				if (number % 2 == 0) {
					number /= 2;
				} else {
					number = 3 * number + 1;
				}
				System.out.print(number + " ");
			} while (number > 1);
		} else {
			System.out.println("���������� �������� �����!");
		}
	}
}
