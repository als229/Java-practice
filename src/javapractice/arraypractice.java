package javapractice;

import java.util.Scanner;

//5-3 정답
//public class arraypractice {
//
//	public static void main(String[] args) {
//		int [] arr= {10, 20, 30, 40, 50};
//		int sum = 0;
//		
//		for(int i = 0; i <arr.length;i++) {
//			sum += arr[i]; 
//		}System.out.println("sum = "+ sum);
//	}
//
//}


//5-4 정답
//public class arraypractice {
//
//	public static void main(String[] args) {
//		int [][] arr= {
//				{5,5,5,5,5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//		};
//		
//		int total=0;
//		float average =0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j<arr[i].length;j++) {
//				total +=arr[i][j];
//			}
//			average = total/20f;
//		}System.out.println("total = "+ total);
//		System.out.println("average = "+ average);
//	}
//
//}
//
////정답 arraycopy 메서드 봐두기
//public class arraypractice {
//
//	public static void main(String[] args) {
//		int[] ballarr= {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		
//		for(int i =0; i <ballarr.length;i++) {
//			int j = (int)(Math.random()*ballarr.length);
//			int tmp = 0;
//			
//			tmp = ballarr[i];
//			ballarr[i] = ballarr[j];
//			ballarr[j] = tmp;
//			
//		}
//		for(int i = 0;i< ball3.length; i++) {
//			ball3[i]= ballarr[i];
//			
//			//나는 이렇게 했는데 
//			//System.arraycopy(ballarr,0,ball3,0,3)이렇게 하면 더 짧다
//			//arraycopy 메서드를 알아두자
//	}
//		for(int i = 0; i <ball3.length; i++) {
//			System.out.println(ball3[i]);
//		}
//		
//	}
//}


//5-6 어렵다 다시한번 봐 
public class arraypractice {

	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			
			for(int j =0; j<question.length;j++) {
				char tmp = ' ';
				int c = (int)(Math.random()*question.length);
				
				tmp = question[j];
				question[j] = question[c];
				question[c] = tmp;
			}
			System.out.printf("Q%d. %s 의 정답을 입력하세요",i+1, new String(question));
			
			String answer = scanner.nextLine();
			
			if(words[i].equals(answer.trim())) {
				System.out.println("정답이다 임마");
			}else 
				System.out.printf("틀렸다 멍청아 ~%n");
		}
	}
}















