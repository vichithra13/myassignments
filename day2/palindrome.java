package week1.day2;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rev,sum=0,temp;
        int n=34343;
        temp=n;
        while(n>0) {
        	rev=n%10;
        	sum=(sum*10)+rev;
        	n=n/10;
        }
        if(temp==sum) 
        	System.out.println("is a palindrome ");
        
        else 
        	System.out.println("not a palindrome");
        
        }
        
	}


