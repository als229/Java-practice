package javapractice;

//6-1 
//class Student {
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//}







//6-2 ��... ���� ��Ծ���. ������������ 
//public class oolpracitce {
//
//	public static void main(String[] args) {
//		Student s = new Student("�����",1,1,100,60,76);
//		
//		String str = s.info();
//		System.out.println(str);
//	}
//}
////
//class Student {
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//	
//	Student(String name, int ban, int no, int kor, int eng, int math) {
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	
//	}
//	public String info() {
//		return name + "," + ban+ "," +no+ "," +kor+ "," +eng+ "," +math+ "," + 
//				(kor+eng+math)+ "," +(int)((kor+eng+math)/3f*10 +0.5f) / 10f;
//	}
//}



//6-3 �����ϸ鼭 ������ �غ��� �� �������� �ܵ��
//public class oolpracitce {
//
//	public static void main(String[] args) {
//		Student s = new Student();
//		s.name = "�����";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
//		System.out.println("�̸� ="+s.name);
//		System.out.println("���� ="+s.gettotal());
//		System.out.println("��� ="+s.getaverage());
//	}
//
//}
//
//class Student {
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//	
//	Student (){}
//	
//	Student(String name, int ban, int no, int kor, int eng, int math) {
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
//	int gettotal( ) {
//		return kor+eng+math;
//	}
//	float getaverage() {
//		return (int)(gettotal() / 3f *10 + 0.5f) / 10f;
//	}
//	public String info() {
//		return name
//				+ "," +ban
//				+ "," +no
//				+ "," +kor
//				+ "," +eng
//				+ "," +math
//				+ "," +gettotal()
//				+ "," +getaverage()
//				;
//	}
//}

//6-4 ���� �Ÿ� ���ϴ� ������ (x-x1)����+(y-y1)���� ��ü�� ��Ʈ�̴�����
//						Math.sqrt ��༮�� ��Ʈ ���ִ� �޼���
//public class oolpracitce {
//
//	static double getdistance(int x, int y, int x1, int y1) {
//		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(getdistance(1,1,2,2));
//	}
//}

		


//6-6 ���θ޼��� ��ġ�� ��ü�� �����ϰ� �ߴ��� ������ �ȵƴ�. Ŭ���� ��������Ʈ�� �ܺη� ������ ������ �ȴ�.
//ã�ƺ��� static method �ȿ��� static���� ������� ���� class�� ����, ����� �� ��Ÿ���� ������ �Ѵ�.
//���� ��Ȯ�� ������ �������� ���� �� ����. 6�� 7�� �����ض���
//class Mypoint {	
//	int x;
//	int y;
//
//	Mypoint(int x, int y) {
//		this.x=x;
//		this.y=y;
//	}
//
//	double getdistance (int x1, int y1) {
//		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
//	}
//
//}
//public class oolpracitce {
//
//	public static void main(String[] args) {
//		Mypoint p = new Mypoint(1,1);
//
//		System.out.println(p.getdistance(2,2));
//	}
//}


//// 6-17
//public class oolpracitce {
//
//	public static int[] shuffle (int []arr) {
//		if(arr ==null || arr.length==0)
//			return arr;
//		
//		for(int i = 0; i < arr.length; i++) {
//			int n = (int)(Math.random()*arr.length);
//			
//			int tmp = arr[i];
//			arr[i] = arr[n];
//			arr[n] = tmp;
//			
//		}
//			
//		
//		
//		return arr;
//	}
//	
//	
//	public static void main(String[] args) {
//		int[] original = {1,2,3,4,5,6,7,8,9};
//		System.out.println(java.util.Arrays.toString(original));
//		
//		int[] result = shuffle(original);
//		System.out.println(java.util.Arrays.toString(result));
//		
//	}
//}


//6-18
//public class oolpracitce{
//	public static boolean isNumber(String str) {
//		if(str==null || str.equals(""))
//			return false;
//		
//		for(int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			
//			if(ch<'0'||ch>'9') {
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	
//	
//	
//	
//	public static void main(String args[]) {
//		String str = "123";
//		System.out.println(str+"�� �����Դϱ�?"+isNumber(str));
//		
//		str = "1234o";
//		System.out.println(str+"�� �����Դϱ�?"+isNumber(str));
//	}
//	
//}

class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;	
	final int MAX_CHANNEL = 100;	
	final int MIN_CHANNEL = 1;	
	
	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	void vouluUp() {
		if(volume<MAX_VOLUME)
			volume++;
	}
	
	void vouluDown() {
		if(volume<MIN_VOLUME)
			volume--;
	}
	
	void channelUp() {
		if(channel==MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}else {
			channel++;
		}
	}
	
	void channelDown() {
		if(channel==MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}else {
			channel--;
		}
	}
	
	
	
	
	
	public class oolpractice(String args[]) {
		
	}
	
}















