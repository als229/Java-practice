package com.ngs.example;


//��� ���� 224p
//	class Tv {
//	boolean power ;
//	int channel;
//	
//	void power() {power = !power;}
//	void chennelup () {++channel;}
//	void chenneldown () {--channel;}
//	}
//
//	
//	
//	class SmartTv extends Tv {
//		boolean caption;
//			
//		void displayCaption (String text) {
//			if(caption) {
//				System.out.println(text);
//			}
//		}
//		
//	}
//	public class Oop2 {
//	
//	public static void main(String[] args) {
//	SmartTv stv = new SmartTv();
//	stv.channel = 10;
//	stv.chennelup();
//	System.out.println(stv.channel);
//	stv.displayCaption("Hello, world");
//	stv.caption = true;
//	stv.displayCaption("Hello, world");
//
//	}
//
//}


//�������� ����ȯ 249p

//public class Oop2{
//	public static void main(String args[]) {
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine f2 = null;
//		
//		fe.water();
//		car = fe;
//		f2 = (FireEngine)car;
//		f2.water();
//	}
//}
//
//class Car {
//	String color;
//	int door;
//	
//	void drive() {
//		System.out.println("Brrrr~");
//	}
//	void stop () {
//		System.out.println("stop!!!");
//	}
//	
//}
//
//class FireEngine extends Car{
//	void water () {
//		System.out.println("water~~~");
//	}
//}

//�Ű������� ������ ���� 253p

class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
		
	}
}

class Tv1 extends Product{
	Tv1(){
		super(100);
	}
public String toString() {return "Tv";}


}

class Computer extends Product{
	Computer() {super(200);}
	
	public String toString() {return "Computer";}
}

class Buyer {
	int money = 10000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ����� ");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�^^");
	
	}
	
}

public class Oop2{
	public static void main(String args[]) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("���� �������� " + b.money+" ���� �Դϴ�.");
		System.out.println("���� ���� 	���ʽ������� " + b.bonusPoint+" ���Դϴ�.");
	}
}











