package GITExercises;

import java.util.Scanner;

public class Domashno_zad2 {
	static char a[] = null;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String tx;
		tx = in.next();

		char o[] = new char[tx.length()];

		for (int i = 0; i < tx.length(); i++) {
			o[i] = tx.charAt(i);
		}

		a = o.clone();

//		sorting();
//		premahvane();

	}


}