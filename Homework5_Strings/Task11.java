import java.util.Scanner;

/*
 * ������ 11:
 * �� �� ������� �����, ����� ��������� ����� � ���������.
 */
public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� �� ���������� � ������: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("�������� ���������� �� ������: ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		printArray(arr);
		sc.close();
	}

	static void printArray(int[] array) {
		for (int index = 0; index < array.length; index++) {
			if (index < array.length - 1) {
				System.out.print(array[index] + ", ");
			} else {
				System.out.print(array[index]);
			}
		}
	}

}
