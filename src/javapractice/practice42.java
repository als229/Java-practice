package javapractice;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Scanner;

import javax.swing.plaf.InputMapUIResource;

//����
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



//����
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

//�ѹ� �� ����
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

//��ø for �� ����
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


////while �� ����
//public class practice42 {
//
//	public static void main(String[] args) {
//		int num = 0, sum = 0;
//		System.out.print("���ڸ� �Է��ϼ���");
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
//		}System.out.println("�� �ڸ����� �� ="+sum);
//	}
//}



public class practice42 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1�� 100 ������ ������ �Է��ϼ���");
			input = scanner.nextInt();
			
			if (input > answer) {
				System.out.println("�� ���� ���Դϴ���");
			}else if (input < answer) {
				System.out.println("�� ū ���Դϴ���");
			} 
			
		}while (input != answer);
		System.out.println("�����Դϴ�");
	}
}




















