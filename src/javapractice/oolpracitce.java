package javapractice;

import java.net.SecureCacheResponse;

//6-1 
//class Student {
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//}







//6-2 ÈÄ... ¸¹ÀÌ ±î¸Ô¾ú´Ù. º¹½Àº¹½Àº¹½À 
//public class oolpracitce {
//
//	public static void main(String[] args) {
//		Student s = new Student("±è°ü¹Î",1,1,100,60,76);
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



//6-3 ÀÌÇØÇÏ¸é¼­ ¿©·¯¹ø ÇØº¸±â ¿Ö ¾ø¾îÁ³¾î ÀÜµð¾ß
//public class oolpracitce {
//
//	public static void main(String[] args) {
//		Student s = new Student();
//		s.name = "±è°ü¹Î";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
//		System.out.println("ÀÌ¸§ ="+s.name);
//		System.out.println("ÃÑÁ¡ ="+s.gettotal());
//		System.out.println("Æò±Õ ="+s.getaverage());
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

//6-4 µÎÁ¡ °Å¸® ±¸ÇÏ´Â °ø½ÄÀº (x-x1)Á¦°ö+(y-y1)Á¦°ö ÀüÃ¼¿¡ ·çÆ®ÀÌ´ÙÉýþ°
//						Math.sqrt ¿ä³à¼®ÀÌ ·çÆ® ÇØÁÖ´Â ¸Þ¼­µå
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

		


//6-6 ¸ÞÀÎ¸Þ¼­µå À§Ä¡¸¦ ÀüÃ¼¸¦ Æ÷ÇÔÇÏ°Ô Çß´õ´Ï ½ÇÇàÀÌ ¾ÈµÆ´Ù. Å¬·¡½º ¸¶ÀÌÆ÷ÀÎÆ®¸¦ ¿ÜºÎ·Î º¸³»¾ß ½ÇÇàÀÌ µÈ´Ù.
//Ã£¾Æº¸´Ï static method ¾È¿¡¼­ staticÀ¸·Î ¼±¾ðµÇÁö ¾ÊÀº class¸¦ »ý¼º, »ç¿ëÇÒ ¶§ ³ªÅ¸³ª´Â ¿À·ù¶ó ÇÑ´Ù.
//¾ÆÁ÷ Á¤È®ÇÑ °³³äÀ» ÀÌÇØÇÏÁö ¸øÇÑ °Í °°´Ù. 6Àå 7Àå º¹½ÀÇØ¶óÀ×
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
//		System.out.println(str+"´Â ¼ýÀÚÀÔ´Ï±î?"+isNumber(str));
//		
//		str = "1234o";
//		System.out.println(str+"´Â ¼ýÀÚÀÔ´Ï±î?"+isNumber(str));
//	}
//	
//}


//6-19
//class MyTv{
//	boolean isPowerOn;
//	int channel;
//	int volume;
//	
//	final int MAX_VOLUME = 100;
//	final int MIN_VOLUME = 0;	
//	final int MAX_CHANNEL = 100;	
//	final int MIN_CHANNEL = 1;	
//	
//	void turnOnOff() {
//		isPowerOn = !isPowerOn;
//	}
//	
//	void vouluUp() {
//		if(volume<MAX_VOLUME)
//			volume++;
//	}
//	
//	void vouluDown() {
//		if(volume<MIN_VOLUME)
//			volume--;
//	}
//	
//	void channelUp() {
//		if(channel==MAX_CHANNEL) {
//			channel = MIN_CHANNEL;
//		}else {
//			channel++;
//		}
//	}
//	
//	void channelDown() {
//		if(channel==MIN_CHANNEL) {
//			channel = MAX_CHANNEL;
//		}else {
//			channel--;
//		}
//	}
//	
//	
//	
//	
//}
//
//public class oolpracitce {
//	public static void main(String args[]) {
//		MyTv t = new MyTv();
//		t.channel = 100;
//		t.volume = 0;
//		System.out.println("CH :"+t.channel+", VOL"+t.volume);
//
//		t.channelDown();
//		t.vouluDown();
//		System.out.println("CH :"+t.channel+", VOL"+t.volume);
//		
//		t.volume = 100;
//		t.channelUp();
//		t.vouluUp();
//		System.out.println("CH :"+t.channel+", VOL"+t.volume);
//	
//	
//	
//	}
//}

//6-20
//public class oolpracitce {
//	public static int max(int[] arr) {
//		if(arr==null||arr.length==0)
//			return -99999;
//		
//		int max = arr[0];
//		
//		for(int i =1; i < arr.length;i++) {
//			if(arr[i]>max)
//				max = arr[i];
//		}
//		return max;
//	}
//	
//	
//	
//	public static void main(String args[]) {
//		int [] data = {3,2,9,4,7};
//		System.out.println(java.util.Arrays.toString(data));
//		System.out.println("ÃÖ´ë°ª:"+max(data));
//		System.out.println("ÃÖ´ë°ª:"+max(null));
//		System.out.println("ÃÖ´ë°ª:"+max(new int[] { }));
//	}
//}

//6-21
class oolpracitce {
	public static int abs(int value) {
		return value >=0 ? value : -value;
	}
	
	
	
	public static void main(String args[]) {
	
		int value = 5;
		System.out.println(value+"ÀÇ Àý´ë°ª:"+abs(value));

		value = -10;
		System.out.println(value+"ÀÇ Àý´ë°ª:"+abs(value));
	}
}
















