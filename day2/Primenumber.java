package week1.day2;

public class Primenumber {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=13;
        boolean flag=false;
        for(int i=2;i<=num/2;++i) 
        	if (num%i==0) {
        		flag=true;
        		System.out.println("is not prime number");
        	}
        	else {
        		flag=false;
        			System.out.println("is  prime number");
        			break;
        			}
        		 
        	}
        
}


