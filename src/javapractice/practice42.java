package javapractice;


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


public class practice42 {

	public static void main(String[] args) {
		int i = 0;
		
		while(i<=10) {
			int j = 0;
			while (j <=i) {
				System.out.println("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}



