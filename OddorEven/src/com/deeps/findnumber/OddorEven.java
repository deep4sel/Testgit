package com.deeps.findnumber;
import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) 
	{
			int num = 0;
		System.out.println("OddorEven.main() : First Java program to find Odd and Even number ");
		System.out.println ("Input the number");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();

	for(int i=1; i< 20; i++){
			
			if ((i%2) == 0 )
 
System.out.println (" This is even number= "+i);
			else
				System.out.println("This is odd number =" +i);
		}
	}

}
