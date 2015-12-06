import java.util.Scanner;

/*
 * ������ 24: ���� ����� X � ���������, a�� �� ���� ������� ������ ����� �
 * ����� ������.
 * �� �� ������� ��������, ����� ��������� ���� �������� ����� � ���������.
 * ����������� ����� do-while.
 */
public class Palyndrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �����: ");
		int number = sc.nextInt();
		int palindrome = number;
		int reverse = 0;
		do {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		} while (palindrome != 0);
		if (number == reverse) {
			System.out.println("������� � ���������!");
		} else {
			System.out.println("������� �� � ���������!");
		}
	}
}