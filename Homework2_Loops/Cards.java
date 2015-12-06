import java.util.Scanner;

/*
 * ������ 21:
 * ������ � �������� ����� �����.
 * ��������� �� ������ �� ����� �: 2,3,4,5,6,7,8,9,10, ����, ����, ���, ���.
 * ��������� �� ���� �� ������� �: ������, ����, ����, ����.
 * �� �� ������� ��������, ���� ����� �� ������� N - ����� ��
 * ��������� [1..51] � �� �������� ��������� ����� ����� �
 * ���������� ��-������ ����� �� �������.
 */
public class Cards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �����: ");
		int number = sc.nextInt();
		String[] paints = { "����", "������", "����", "����" };
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "����", "����", "���", "���" };
		for (int index = number; index <= 52; index++) {
			if (index == 52) {
				System.out.print(cards[(index - 1) / 4] + " " + paints[index % 4]);
			} else {
				System.out.print(cards[(index - 1) / 4] + " " + paints[index % 4] + ", ");
			}
		}
	}
}