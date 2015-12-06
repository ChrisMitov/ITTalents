import java.util.Scanner;

/*
 * ������ 12:
 * �� �� ������� �����, ����� ������ �� ������ ����� ����� N �
 * ����� ����� �� ����� � ������� N, ����� ������� ������ �����
 * �� 1 �� N.
 */
public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� N: ");
		int number = sc.nextInt();
		int[] arr = createArray(number);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

	static int[] createArray(int n) {
		int[] arr = new int[n];
		for (int i = 1; i <= arr.length; i++) {
			arr[i - 1] = i;
		}
		return arr;
	}
}