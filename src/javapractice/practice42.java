package javapractice;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Scanner;


//4-2����
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



//4-3����
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

//
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


//do - while ������
//public class practice42 {
//
//	public static void main(String[] args) {
//		int input = 0, answer = 0;
//		
//		answer = (int)(Math.random()*100)+1;
//		Scanner scanner = new Scanner(System.in);
//		
//		do {
//			System.out.println("1�� 100 ������ ������ �Է��ϼ���");
//			input = scanner.nextInt();
//			
//			if (input > answer) {
//				System.out.println("�� ���� ���Դϴ���");
//			}else if (input < answer) {
//				System.out.println("�� ū ���Դϴ���");
//			} 
//			
//		}while (input != answer);
//		System.out.println("�����Դϴ�");
//	}
//}



//�̸� ���� �ݺ��� ����
//public class practice42 {
//
//	public static void main(String[] args) {
//		int menu = 0, num = 0;
//		Scanner scanner = new Scanner(System.in);
//
//		outer :
//			while(true) {
//				System.out.println("(1) square");
//				System.out.println("(2) square root");
//				System.out.println("(3) log");
//				System.out.println("���ϴ� �޴��� �����ϼ��� ^^ �����Ͻ÷��� 0�� ��������");
//
//				menu = scanner.nextInt();
////				menu = tmp;
//
//				if(menu ==0) {
//					System.out.println("���α׷��� �����մϴ�");
//					break;
//				}else if (menu<1 || menu >3) {
//					System.out.println("���� ���� �Է��غ���");
//					continue;
//				}
//				for(;;) {
//					System.out.println("����� ���� �Է��ϼ��� ��ü����� 99, ��� ����� 0�� �������� ^^");
//					num = scanner.nextInt();
////					num = tmp;
//
//					if (num ==0) {
//						break;
//					}else if (num ==99) {
//						break outer;
//					}
//					switch (menu) {
//					case 1:
//						System.out.println("result ="+num*num);
//						break;
//					case 2:
//						System.out.println("result ="+Math.sqrt(num));
//						break;
//					case 3:
//						System.out.println("result =" + Math.log(num));
//						break;
//					}
//				}
//
//			}
//	}
//}



//4-4 �ѹ� �� ���� c=-c�κ� Ʋ�� (c= -1�̶����)
//public class practice42 {
//
//	public static void main(String[] args) {
//		int sum = 0, num = 0;
//		int c = 1;
//		for(int i = 1; true;i++,c=-c) {
//			num=i*c;
//			sum+=num;//sum = sum+num
//			
//			if(sum >=100) {
//				break;
//			}
//		}
//		
//		System.out.println("num = "+num);
//		System.out.println("sum = "+sum);
//	}
//}

//4-5 �ٽ� �ѹ� ���� int j = 0; �̰� ��ġ Ʋ�� �ι�° while �ȿ� �־�� �ϴµ� �ۿ� ������
//							��� ���� +1 �Ծ �� �ϳ��� ����
//public class practice42 {
//
//	public static void main(String[] args) {
//		int i = 0;
//		while(i <=10) {
//			int j = 0;
//			while(j <=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//	}
//}


//4-6 ����
//public class practice42 {
//
//	public static void main(String[] args) {
//		int sum=0;
//		
//		for(int i =1; i<=6;i++) {
//			for(int j = 1;j <=6;j++) {
//				sum = i+j;
//				if (sum ==6) {
//					System.out.printf("%d + %d = %d %n",i , j,sum);
//				}
//			}
//		}
//	}
//}


//4-7 ���� -'0' ���ִ� �� ������
//public class practice42 {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int num = 0;
//		int sum = 0;
//		String str = scanner.nextLine();
//		
//		for (int i =0; i <str.length();i++) {
//			num = str.charAt(i);
//			sum += num-'0';
//			System.out.println(str.charAt(i)+" "+sum);
//		}
//
//	}
//}


//4-8 *7 �� �ϸ� �Ȱ��� �� �˾Ҵµ� *6�ϰ� +1�� �ؾ� 1~6������ ����
//		*7�� �ع����� 0���� 6�� ���� ��û��
//public class practice42 {
//
//	public static void main(String[] args) {
//		int value = 0;
//		
//		value = (int)(Math.random()*6)+1;
//		
//		System.out.println(value);
//	}
//}


//4-9 while �� �ȿ��� num �� �����ϴٰ� ��� �ظ̴� �ٽ� �ѹ� �غ���
//public class practice42 {
//
//	public static void main(String[] args) {
//		int sum = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		int num = scanner.nextInt();
//		
//		while (num!=0) {
//			sum += num%10;
//			num /=10;
//			System.out.println(num);
//		}System.out.println(sum);
//	}
//}


//4-10 ��ü���� ������ �Ⱥ��� �׷����� ���� 
public class practice42 {

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count =0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1�� 100 ������ ���ڸ� �Է��ض�");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�� ������??");
			}else if (input < answer) {
				System.out.println("�� ũ����");
			}else {
				System.out.println("����ϱ� �����");
				break;
			} 
		}while (true);
		System.out.println(count+"�� ���� ����� ������ ^^");
	}
}




























