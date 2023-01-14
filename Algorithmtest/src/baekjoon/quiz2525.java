package baekjoon;

import java.util.Scanner;

public class quiz2525 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
	
		if(b+c<60) {
			System.out.println(a+" "+(b+c));
		
		}
		
	
		else if(b+c>=60 && a+((b+c)/60)<23) {
			System.out.println(a+((b+c)/60)+" "+((b+c)-(60*((b+c)/60))));
			
		}
		
		
		else if(a+((b+c)/60)>=24) {
			System.out.println((a+((b+c)/60)-24)+" "+((b+c)-(60*((b+c)/60))));
		}
	
	}
	

}
