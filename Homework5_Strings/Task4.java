import java.util.Scanner;

/*
 * ������ 4:
 * �� �� ������� ��������, ���� ����� �� �������� ����� ����� �� �����
 * ������ ��������� ��� �������, �� ������� ��� ��� ��� ��-����� ����
 * �� ASCII �������� �� ����������� ����� �����.
 * ������: Anna Dosewa Asenowa, Iwo Peew Peew
 * �����: Anna Dosewa Asenowa
 */
public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(",");
		if (arr.length > 2) {
			System.out.println("�������� �� ������ �� 2 �����.");
			return;
		}
		int maxSum = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].trim();
			int sum = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				sum += (int) arr[i].charAt(j);
			}
			if (maxSum <= sum) {
				maxSum = sum;
				index = i;
			}
		}
		System.out.println(arr[index]);
		sc.close();
	}
}