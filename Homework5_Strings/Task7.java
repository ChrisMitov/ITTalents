import java.util.Scanner;

/*
 * ������ 7:
 * �� �� ������� ��������, ����� ���� ����� �� ���� ��������� �
 * ��������.
 * ���� �������� �� �� �������� ���� �� ���������� ����, ����� � ����
 * ����� � ���-������� ����.
 * ������: asd fg hjkl
 * �����: 3 ����, ���-������� � � 4 �������.
 */
public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > max) {
				max = arr[i].length();
			}
		}
		System.out.println(arr.length + " ����, " + "���-������� � � " + max + " �������");
		sc.close();
	}

}
