import java.util.Scanner;

/*
 * ������ 8:
 * �� �� ������� ��������, ���� ����� �� ������� ��� �� �������
 * (������, ���).
 * ���������� �� ������ �� ������ ���� ��������� ������ � ���������,
 * �.�. ���� ����� ������-������� � �������-������ � ���� � ���.
 * ����: �����
 * �����: ��.
 * ����: ��������
 * �����: ��.
 */
public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		// 1�� ����� - � ���������� �� ����������� ������, ����� ������� �������
		// ��������� ��������� ������
		// String reverse = "";
		// for (int i = str.length() - 1; i >= 0; i--) {
		// reverse += str.charAt(i);
		// }
		// if (str.equals(reverse)) {
		// System.out.println("��.");
		// } else {
		// System.out.println("��.");
		// }
		// sc.close();
		
		
		// 2�� ����� - � ������ ���������� � �������� ���� ����� ������ ��
		// �������� �� ���� (� �������� � ����) �� �����
		boolean isPalindrome = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("��.");
		} else {
			System.out.println("��.");
		}
		sc.close();
	}

}
