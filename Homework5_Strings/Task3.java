import java.util.Scanner;

/*
 * ������ 3:
 * �� �� ������� ��������, ���� ����� �� �������� �������������� ���
 * ������ �� ������� ��� ���������.
 * ���������� �� ������� ��������� �� ��������� �� ����������� �� ��
 * �������.
 * ������: ���������, ���������
 * �����: ����� ���� �� � ����� �������.
 * ������� �� �������:
 * 8 �-�
 * 9 �-�
 */
public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstWord = sc.next();
		String secondWord = sc.next();
		int n = 0;
		if (firstWord.length() > secondWord.length()) {
			System.out.println("������� ���� � ��-�����.");
			n = secondWord.length();
		} else {
			n = firstWord.length();
			if (firstWord.length() < secondWord.length()) {
				System.out.println("������� ���� � ��-�����.");
			} else {
				System.out.println("����� ���� �� � ����� �������.");
			}
		}
		System.out.println("������� �� �������:");
		int p = 0;
		for (int i = 0; i < n; i++) {
			if (firstWord.charAt(i) != secondWord.charAt(i)) {
				System.out.println((i + 1) + " " + firstWord.charAt(i) + "-" + secondWord.charAt(i));
				p++;
			}
		}
		if (p == 0) {
			System.out.println("���� ������� � ������.");
		}
	}
}