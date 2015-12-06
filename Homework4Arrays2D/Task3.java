import java.util.Scanner;

/*
 * ������ 3:
 * ����� �������� ����� �� �����, ����� 
 * ��������� �� �������� �������������. 
 * �� �� ��������� ������ �� ���������� �� ������, 
 * ����� � ������������������� �� ���� �����.
 */
public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ���� ������ : ");
		int n = sc.nextInt();
		System.out.print("�������� ���� ������ : ");
		int m = sc.nextInt();
		int[][] array = new int[n][m];
		int sum = 0;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				System.out.print("�������� �������� �� ��� " + row + " � ������ " + col + " : ");
				array[row][col] = sc.nextInt();
				sum += array[row][col];
			}
		}
		System.out.println("������ �� ���������� � ��������� �: " + sum);
		float avg = (float) sum / (n * m);
		System.out.println("������������������� �� ������� � ��������� �: " + avg);
		sc.close();
	}
}
