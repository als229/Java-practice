package javapractice;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Scanner;

import javax.swing.plaf.InputMapUIResource;

//정답
//public class practice42 {
//
//	public static void main(String[] args) {
//		int sum=0;
//		
//		for(int i = 1; i<20;i++) {
//			if (!(i %2 ==0 || i %3 ==0))
//			sum += i;
//		}System.out.println(sum);
//
//	}
//
//}



//정답
//public class practice42 {
//
//	public static void main(String[] args) {
//		int sum = 0;
//		int total = 0;
//		
//		for(int i= 1 ; i <=10;i++) {
//			sum += i;
//			total += sum;
//		}
//		System.out.println(total);
//	}
//;
//}

//한번 더 보기
//public class practice42 {
//
//	public static void main(String[] args) {
//		int i = 0;
//		
//		while(i<=10) {
//			int j = 0;
//			while (j <=i) {
//				System.out.println("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//	}
//}

//중첩 for 문 예제
//public class practice42 {
//
//	public static void main(String[] args) {
//		for (int i = 0; i <=10;i++) {
//			for(int j = 0; j <=i; j++) {
//				System.out.print("*");
//			}System.out.println("");
//		}
//	}
//}


////while 문 예제
//public class practice42 {
//
//	public static void main(String[] args) {
//		int num = 0, sum = 0;
//		System.out.print("숫자를 입력하세요");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while(num!=0) {
//			sum += num%10;
//			System.out.printf("sum = %3d num = %3d %n", sum , num);
//			num /= 10;
//		
//		
//		}System.out.println("각 자리수의 합 ="+sum);
//	}
//}



public class practice42 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1과 100 사이의 정수를 입력하세용");
			input = scanner.nextInt();
			
			if (input > answer) {
				System.out.println("더 작은 값입니다잉");
			}else if (input < answer) {
				System.out.println("더 큰 값입니다잉");
			} 
			
		}while (input != answer);
		System.out.println("정답입니다");
	}
}




















