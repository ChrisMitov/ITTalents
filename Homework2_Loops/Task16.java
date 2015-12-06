import java.util.Scanner;

/*
 * ������ 16:
 * �� �� ������� ��������, ���� ����� �� �������� 2 ����������
 * ����� N, M �� ��������� [10..5555].
 * ����������, ���� ����� for, �� ������� ������ ����� ��
 * ���������, ����� �� ������ �� 50 � �������� ���.
 */
public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �����:");
		int n = sc.nextInt();
		System.out.println("�������� �����:");
		int m = sc.nextInt();
		// ����������� 2 ������ �� ���������, ����������� ��� �� 2�� ����� �
		// ��-������.
		if (m >= n) {
			for (int index = m; index >= n; index--) {
				if (index % 50 == 0) {
					System.out.print(index + " ");
				}
			}
		} else {
			for (int index = n; index >= m; index--) {
				if (index % 50 == 0) {
					System.out.print(index + " ");
				}
			}
		}
	}
}