import java.util.Scanner;

/*
 * ������ 2:
 * �� �� ������� ��������, ���� ����� �� ������������ �� ��������
 * �������������� ��� ���� � ������� 10-20 �����.
 * ���������� �� ������� ������� �� 5 ����� � �� ������ ��������� ��
 * ��-�������, ����� � ������ �� ����������.
 * ������: uchilishe uchenik
 * �����: 9 uchenishe
 */

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int k = 0;
		if (str1.length() >= str2.length()) {
			k = str1.length();
			System.out.println(k + " " + (str2.substring(0, 5) + str1.substring(5)));
		} else {
			k = str2.length();
			System.out.println(k + " " + (str1.substring(0, 5) + str2.substring(5)));
		}
		sc.close();
	}

}
