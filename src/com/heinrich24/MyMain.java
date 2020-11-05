package com.heinrich24;

import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] a = new int[n];
		for (int x = 0; x < a.length; x++) {
			a[x] = (scan.nextInt());
		}

		scan.close();

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
