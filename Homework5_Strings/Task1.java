import java.util.Scanner;

/*
 * ������ 1:
 * �� �� ������� ��������, ���� ����� �� �������� ��� ���� ���������
 * �� 40 ������ � ����� �����.
 * ���� �������� �� ������ �� �� �������� �������� ���� � ������ � ����
 * � ����� �����.
 * ������: Abcd Efgh
 * �����: ABCD abcd EFGH efgh
 */
public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if (str1.length() > 40 || str2.length() > 40) {
			System.out.println("�������� �� ��-����� �� 40 �������.");
			return;
		}
		System.out.print(str1.toUpperCase() + " " + str1.toLowerCase() + " ");
		System.out.print(str2.toUpperCase() + " " + str2.toLowerCase() + " ");
		sc.close();
	}
}