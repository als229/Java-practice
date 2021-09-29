package javapractice;

import java.util.Scanner;

public class jandiya {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = 45;
		b = b-c;
		if(b <0) {
			b = b+60;
			a = a-1;
		}
		if(a <0) {
			a= a+24;
		}


		System.out.println(a +" "+ b);
	}
}