package java_coding_exercise1;
import java.util.Scanner;

public class Number {
	public void CheckPrime(int num){
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("It is a prime Number");
		}else {
			System.out.println("It is not a prime Number");
		}
		
		
		
		
	}


public void ArmStrong(int num) {
	
	int temp=num;
	int r ,sum=0;
	while(num>0) {
		r=num%10;
		num=num/10;
		sum=sum+r*r*r;
		
	}
	if(temp==sum) {
		System.out.println("It is Armstrong Number");
	}else {
		System.out.println("It is not Armstrong Number");
	}
	
	
	
}
public void CheckPalindrome(int num) {
	
	int rev=0,r;
	int temp=num;
	while(num>0) {
		r=num%10;
		rev=(rev*10)+r;
		num=num/10;
	}
	if(temp==rev) {
		System.out.println("It is palindrome");
	}else {
		System.out.println("It is not a Plindrome");
	}
		
		
}

public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	Number number = new Number();
	number.CheckPrime(num);
    number.ArmStrong(num);
    number.CheckPalindrome(num);
	
	
}
}
	

