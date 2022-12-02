package week1.day1;

public class Mobile {
	public void MakeCall() {
	     String mobilemodel ="linux";
		 float mobileweight =2.200f;
		 System.out.println("call my friend");

	}
	public void sendmsg() {	
		boolean isfullycharged = true;
		int mobilecost = 15000;
		System.out.println("goodmorning");
	}
	public static void main(String[] args) {
	Mobile assign= new Mobile();
	// TODO Auto-generated method stub
assign.MakeCall();
assign.sendmsg();
System.out.println("this is my mobile");
}
}