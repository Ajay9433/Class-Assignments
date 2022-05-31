package Basic_programs;
//print the even number in between 1 to 50.

import java.util.Scanner;

public class EvenNumber {
public static void main(String[] args) {
	int i,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the max. range: ");
	n=sc.nextInt();
	
	for(i=1;i<=n;i++)
	{
		if(i%2==0)
		{
		System.out.println(i);
		}
		/*
		 for(i=2;i<=50;i=i+2)
		 {
		 System.out.println(i0; 
		 */
	}
	sc.close();
}

}
