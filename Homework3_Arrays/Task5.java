/*
 * ������ 5:
 * �������� ��������, ����� ������� ����� � 10 �������� � 
 * ������������ ����� �� ���������� ��� ��������, ����� �� ������� �� 
 * ��������, ������� �� 3.
 * �� �� ������� ���������� �� ������.
 */
public class Task5 {

	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 3;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}