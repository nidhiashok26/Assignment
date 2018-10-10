package com.deloitte;

public class Divisibilityby35 {

	public static void main(String[] args) {
		int flag, n=1;
		
		while(n<51) {
		
		if(n%3==0) 
			flag=1;
		else
			flag=0;
		
		if(n%5==0) 
			flag=2;
		else
			flag=flag;
		
		if((n%3==0) && (n%5==0))
			flag=3;
		else flag=flag;
		
		switch(flag) {
		
		case 0:
			System.out.println(n);
			break;
		case 1:
			System.out.println("abc");
			break;
		case 2:
			System.out.println("xyz");
			break;
		case 3:
			System.out.println("abcxyz");
			break;
		}
		
			n++;
		}

	}

}
