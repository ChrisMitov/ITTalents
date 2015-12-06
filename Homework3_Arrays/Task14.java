/*
 * ������ 14:
 * ����� ������������� ������� ��������� �����, �������� ������
 * �����.
 * �� �� ������� ��������, ���� ����� �� ������� ���� �������� ���
 * ��������� �� ��������� [-2.99..2.99] � ������ ������ �� ������� ��
 * ������.
 * ������: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
 * �����: 0.2; 0.99; 1.4; 1.2
 */
public class Task14 {

	public static void main(String[] args) {
		double[] array = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2, -2.99, 0 };
		int count = 0;
		// ����������� �� ���� �������� � ������, ����� �������������� ���������.
		for (int index = 0; index < array.length; index++) {
			if (array[index] >= (-2.99) && array[index] <= 2.99) {
				count++;
			}
		}
		// ��������� �� ��� ����� � ���� �����.
		double[] finalArray = new double[count];
		// ����������� �� � ������.
		for (int index = 0; index < array.length; index++) {
			if (array[index] >= (-2.99) && array[index] <= 2.99) {
				finalArray[finalArray.length-count] = array[index];
				count--;
			}
		}
		// ��������� �� ������ ������.
		for (int i = 0; i < finalArray.length; i++) {
			System.out.print(finalArray[i] + " ");
		}
	}
}