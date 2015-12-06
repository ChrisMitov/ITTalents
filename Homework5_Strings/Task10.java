import java.util.Scanner;

/*
 * Задача 10:
 * Да се състави програма, която по даден низ връща друг,
 * символите, на който са получени като към всеки код на символ
 * от ASCII таблицата е добавеното числото 5 и е записан
 * новополучения символ.
 * Пример :
 * Вход: Hello
 * Изход: Mjqqt
 */
public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			char newLetter = (char)(word.charAt(i) + 5); 
			newWord +=newLetter;	
		}
		System.out.println(newWord);
		sc.close();
	}
}