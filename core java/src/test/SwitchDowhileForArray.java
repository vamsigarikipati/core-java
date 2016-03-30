package test;

import java.util.Scanner;

public class SwitchDowhileForArray {

	public static void main(String[] args) {
		char t;
		do {
			System.out.println("enter a string : ");
			Scanner in = new Scanner(System.in);
			String input = in.nextLine();
			int length = input.length();
			char[] character = new char[length];
			for (int i = 0; i < length; i++) {
				character[i] = input.charAt(i);
			}
			int vowel = 0;
			for (char j : character) {
				switch (j) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vowel++;
					break;
				default:
					break;
				}
			}
			int consonants = length - vowel;
			System.out
					.println("no. of vowels : " + vowel + "\nno. of consonants & other characters : " + consonants + "\ntry again? (y/n)");
			t = in.next().charAt(0);
		} while (t == 'y');
		System.out.println("bye");
	}

}
