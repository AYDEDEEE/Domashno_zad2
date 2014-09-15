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

		sorting();
//		premahvane();

	}
	
	public static void sorting() {
		boolean ok = false;
		int br = 0, maxbr = 0, indfirst = 0, indsecond = 0, broqch = 0;

		for (int i = 0; i < a.length; i++) {
			for (int k = i + 1; k < a.length; k++) {
				if (a[i] == a[k]) {
					broqch++;
					if (k != i + 1) {
						for (int l = i + 1; l < k; l++) {
							for (int p = l + 1; p < k; p++) {
								if (a[l] != a[p]) {
									ok = true;
									br++;
								} else {
									ok = false;
									br = 0;
									break;

								}

							}
						}
					} else {
						br = 0;
						ok = true;
					}

				}
				if (ok == true && br >= maxbr) {
					maxbr = br;
					br = 0;
					indfirst = i;
					indsecond = k;
				}

			}
		}
		char[] temp = new char[a.length - 1];
		for (int i = 0; i < indfirst; i++) {
			temp[i] = a[i];
		}
		for (int i = indfirst + 1; i < indsecond; i++) {
			temp[i] = a[i];
		}
		for (int i = indsecond + 1; i < temp.length; i++) {
			temp[i] = a[i];
		}
		temp[temp.length - 1] = a[indsecond];
		a = null;
		a = temp.clone();
		if (broqch > 1) {
			sorting();
		}
		}
	}


