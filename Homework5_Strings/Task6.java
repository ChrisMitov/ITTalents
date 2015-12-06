import java.util.Scanner;

/*
 * ������ 6:
 * �� �� ������� ��������, ���� ����� �� ������� ��������� � �������
 * ����.
 * ���� �������� �� ������ �� �� ������� ����� �����, �� ����� �������
 * ���� �� ������� � ������ �����, � ���������� � ����� �� �� �����.
 * ������: ����� ����� ������
 * �����: ����� ����� ������
 */
public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// ���������� �� � ����� ������ ����.
		String[] arr = str.split(" ");
		// ��������� StringBuilder �� �� ������������ ����.
		StringBuilder sb = new StringBuilder();
		// ��������� ����, ���� ������� ����� �� ����� ���� ����� ������,
		// ���������� ���������� ���� � �������� ����������.
		for (int i = 0; i < arr.length; i++) {
			// ��� stringbuilder-� �� ������������ ��� �����.(���� ����� ��
			// ������� �� ��������).
			// sb.append(arr[i].substring(0, 1).toUpperCase()).append(arr[i].substring(1)).append(" ");

			// ��������� ������� �� 2 � ����� �� �������������, ���� ���� ���
			// ��������� ���������� ����� 2�� �����.
			// ����� ��-����� ����� �� stringbuilder.
			arr[i] = (arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1, arr[i].length()).toLowerCase());
		}
		// System.out.println(sb.toString().trim());
		str = String.join(" ", arr);
		System.out.println(str);
	}
}
