package javapractice;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Scanner;


//4-2정답
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



//4-3정답
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


//do - while 문예제
//public class practice42 {
//
//	public static void main(String[] args) {
//		int input = 0, answer = 0;
//		
//		answer = (int)(Math.random()*100)+1;
//		Scanner scanner = new Scanner(System.in);
//		
//		do {
//			System.out.println("1과 100 사이의 정수를 입력하세용");
//			input = scanner.nextInt();
//			
//			if (input > answer) {
//				System.out.println("더 작은 값입니다잉");
//			}else if (input < answer) {
//				System.out.println("더 큰 값입니다잉");
//			} 
//			
//		}while (input != answer);
//		System.out.println("정답입니다");
//	}
//}



//이름 붙은 반복문 예제
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
//				System.out.println("원하는 메뉴를 선택하세요 ^^ 종료하시려면 0을 누르세용");
//
//				menu = scanner.nextInt();
////				menu = tmp;
//
//				if(menu ==0) {
//					System.out.println("프로그램을 종료합니다");
//					break;
//				}else if (menu<1 || menu >3) {
//					System.out.println("값을 잘좀 입력해봐요");
//					continue;
//				}
//				for(;;) {
//					System.out.println("계산할 값을 입력하세요 전체종료는 99, 계산 종료는 0을 누르세용 ^^");
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



//4-4 한번 더 보기 c=-c부분 틀림 (c= -1이라고함)
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

//4-5 다시 한번 보기 int j = 0; 이거 위치 틀림 두번째 while 안에 넣어야 하는데 밖에 꺼내서
//							계속 같이 +1 먹어서 별 하나씩 찍힘
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


//4-6 정답
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


//4-7 정답 -'0' 해주는 걸 잊지마
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


//4-8 *7 을 하면 똑같을 줄 알았는데 *6하고 +1을 해야 1~6까지가 나옴
//		*7을 해버리면 0부터 6이 나옴 멍청아
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


//4-9 while 문 안에서 num 값 설정하다가 잠깐 해맸당 다시 한번 해보기
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


//4-10 전체적인 구조를 안보고 그려보자 ㅎㅎ 
public class practice42 {

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count =0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100 사이의 숫자를 입력해라");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은걸??");
			}else if (input < answer) {
				System.out.println("더 크지롱");
			}else {
				System.out.println("대단하군 맞췄네");
				break;
			} 
		}while (true);
		System.out.println(count+"번 만에 맞췄어 축하행 ^^");
	}
}




























