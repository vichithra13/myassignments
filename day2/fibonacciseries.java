package week1.day2;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8;
		int a=0,b=1,c;
		for(int i=0;i<range;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(+c);
			
		}
	}

}
