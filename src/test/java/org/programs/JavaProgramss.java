package org.programs;

public class JavaProgramss {
	
	public static void main(String[] args) {
		
////		1. Print 1 to 100 numbers.
//		
//		for(int i=1;i<=100;i++) {
//			System.out.println(i);
//		}
//		
////		2. Find the given number is odd or even.
//
//		//  /----divide    %----modulus (remainder)
//		
//		int num=11;
//		
//		// even number
//		if(num%2==0) {
//			System.out.println("Even Number");
//		}
//		
//		// odd number
//		if(num%2!=0) {
//			System.out.println("Odd Number");
//		}
//		
//		
////		3. Print even number from 1 to 100 and even count.
//
//		int evenCount=0;
//		
//		for(int i=1;i<=100;i++) {
//			
//			if(i%2==0) {
//				System.out.println(i);
//				evenCount++;
//			}
//			
//		}
//		
//		System.out.println("Even Count is: "+evenCount);
//		
//		
////		4. Print odd number from 1 to 100 and odd count.
//
//		int oddCount=0;
//		
//		for(int i=1;i<=100;i++) {
//			
//			if(i%2==1) {
//				System.out.println(i);
//				oddCount++;           // oddCount=oddCount+1
//			}
//			
//		}
//		
//		System.out.println("Odd Count is: "+oddCount);
//		
////		5. Print sum of numbers from 1 to 10.    1+2+3+4+5+6+7+8+9+10=55
//		
//		int sum = 0;
//		
//		for(int i=1;i<=10;i++) {
//			
//			sum=sum+i;
//			
//		}
//		
//		System.out.println(sum);
//
//		
////		6. Print sum of even number & odd number from 1 to 10.
//
//		int even=0,odd=0;
//		
//		for(int i=1;i<=10;i++) {
//			
//			if(i%2==0) {
//				even=even+i;
//			} 
//			else {
//				odd=odd+i;
//			}
//			
//		}
//
//		System.out.println("Sum of Even: "+even);
//		System.out.println("Sum of Odd: "+odd);
//		
//		
////		7. Factorial of the number.
//		
//		// 5       5*4*3*2*1=120
//		
//		int n=5;
//		// logic 1
//		int fact=1;
//		for(int i=n;i>=1;i--) {
//			
//			fact=fact*i;
//		}
//		
//		System.out.println(fact);
//		
//		
//		// logic 2
//		int f=1;
//		for(int i=1;i<=n;i++) { // 1  2  3  4  5  6
//			
//			f=f*i;  // 1*1=1  1*2=2   2*3=6  6*4=24  24*5=120 
//			
//		}
//		
//		System.out.println(f);
		
		int nk=1;
		while(nk<=10) {
			System.out.println(nk);
			nk++;
		}
		
//		8. Reverse the number.
		
		// i/p---123       o/p---321
		
		int r=8569;
		int re=0,l=0;
		
		while(r>0) {	  // 123>0          12>0              1>0
			
			l=r%10;       // 123%10=3       12%10=2           1%10=1
			re=l+(re*10); // 3+(0*10)=3     2+(3*10)=2+30=32  1+(32*10)=1+320=321
			r=r/10;       // 123/10=12.3=12 12/10=1.2=1       1/10=0.1=0
		}
		
		System.out.println("Reverse Number is "+re);
		
//		9. Find the given number is palindrome or not.

		// i/p---121     o/p---121
		
		int p=1221;
		int t=p;
		int m=0,n=0;
		
		while(p>0) {
			
			m=p%10;
			n=m+(n*10);
			p=p/10;
		}
		
		if(t==n) {
			System.out.println("given number is palindrome");
		}
		else {
			System.out.println("given number is not palindrome");
		}
		
		
//		10. Fibanoic Series.
		
		// 0,1,1,2,3,5,8,13..........
		
		int a=0,b=1;
		
		System.out.print(a+" ");  // 0
		System.out.print(b+" ");  // 1
		
		for(int i=0;i<8;i++) {
			
			int c=a+b;               // 0+1=1  1+1=2  1+2=3
			System.out.print(c+" "); // 1      2      3
			a=b;                     // a=1    a=1    a=2
			b=c;                     // b=1    b=2    b=3
		
		}

		System.out.println();
//		11. Find the Count of digits and Sum of digits.

		// d=1234    count=4  sum=10
		
		int digit=1234;
		int count=0,sum=0,g=0;
		
		while(digit>0) {
			
			g=digit%10;          // 1234%10=4
			sum=sum+g;           // 0+4=4
			count++;
			digit=digit/10;      // 1234/10=123.4=123
			
		}
		
		System.out.println("Sum of Digits..."+sum);
		System.out.println("Count of Digits..."+count);
		
		
		
	}

}
