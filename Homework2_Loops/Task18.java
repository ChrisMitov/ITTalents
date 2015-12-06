import java.util.Scanner;

/*
 * ������ 18: 
 * �� �� ������� ��������, ���� ����� �� ������� ��� ����� �� ��������� [1..9].
 * ���������� �� ������� ��������� �� ���������.
 * ������������ �������� �� ����������� � ���������� �� 2-�� �����.
 */
public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� 2 �����: ");
		byte n = sc.nextByte();
		byte k = sc.nextByte();
		if (n >= 1 && n <= 9 && k >= 1 && k <= 9) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= k; j++) {
					System.out.println(i + "*" + j + " = " + i * j);
				}
			}
		} else {
			System.out.println("���������� �����!");
		}
	}
}