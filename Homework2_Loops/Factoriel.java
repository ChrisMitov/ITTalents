import java.util.Scanner;

/*
 * ������ 25: �� �� ������� ��������, ����� �� ������ ����� N, �� ��������� N!,
 * �.�. 1*2*3*4...*N. 
 * ����������� ����� do-while.
 */
public class Factoriel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� N: ");
		int fact = sc.nextInt();
		long sum = 1;
		do {
			sum *= fact;
			fact--;
		} while (fact > 0);
		System.out.println(sum);
	}

}
