import java.util.Scanner;

/* ������ 8:
 * �������� ��������, ����� ������ � ������� ���-������� ������ ��
 * ������� ������� �������� � ����� �����.
 */
public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ������� �� ������: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int index = 0; index < array.length; index++) {
			System.out.print("�������� " + (index + 1) + "-��� �������: ");
			array[index] = sc.nextInt();
		}
		int counter = 0;
		int maxSequence = 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			counter = 0;
			int j = i;
			while (array[j] == array[i]) {
				counter++;
				j++;
				if (j == array.length) {
					break;
				}
			}
			if (counter > maxSequence) {
				maxSequence = counter;
				index = i;
			}
		}
		for (int i = index; i < index + maxSequence; i++) {
			if (i != index + maxSequence - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		sc.close();
	}

}
