import java.util.Scanner;

public class javapractice1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		int box = 10;
		int num = 0;
		
		num = a%box == 0 ? a/box : a/box +1; 
		
		System.out.println(num);
	}

}
