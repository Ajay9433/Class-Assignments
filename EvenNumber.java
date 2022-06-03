package Basic_programs;
//print the even number in between 1 to 50.

import java.util.Scanner;

public class EvenNumber {
public static void main(String[] args) {
	int i,n;//declaring the variables
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the max. range: ");
	n=sc.nextInt();//taking input fom user
	
	for(i=1;i<=n;i++)//implimenting condition to get even vlue
	{
		if(i%2==0)
		{
		System.out.println(i);
		}
		
		//another way to find same thing
		/*
		 for(i=2;i<=50;i=i+2)
		 {
		 System.out.println(i0; 
		 */
	}
	sc.close();
}

}
