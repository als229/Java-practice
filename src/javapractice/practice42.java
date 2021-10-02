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
		int sum = 0;
		int s = 1;
		int num = 0;

		for(int i = 1 ;true;i++,s=-s) {
			sum += num;
			num = s*i;

			if(sum>=100) {
				break;
			}System.out.println(sum);
			System.out.println(num);
		}
	}
}



