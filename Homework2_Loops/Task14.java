import java.util.Scanner;

/*
 * ������ 14: �� �� ������� ��������, ����� �� ��������
 * ���������� ����� N �� ��������� [10..200] ������� � �������
 * ��� ������ �����, ����� �� ������ �� 7 � �� ��-����� �� N.
 */
public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �����: ");
		int number = sc.nextInt();
		if (number >= 10 && number <= 200) {
			for (int index = 200; index >= 10; index--) {
				if (index % 7 == 0 && index < number) {
					System.out.print(index + " ");
				}
			}
		} else {
			System.out.print("���������� �����!");
		}
		sc.close();
	}
}