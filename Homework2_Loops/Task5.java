import java.util.Scanner;
/*
 * ������ 5: �� �� ������� �� ����������� 2 �����. � �� ��
 * ������� �� ������ ������ ����� �� ��-������� �� ��-��������.
 */

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ������� �����: ");
		int first = sc.nextInt();
		System.out.print("�������� ������� �����: ");
		int second = sc.nextInt();
		if (first < second) {
			for (int i = first; i <= second; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = second; i <= first; i++) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}