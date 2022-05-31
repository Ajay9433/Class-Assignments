package Basic_programs;
//print the number of Digit of a given number by user

import java.util.Scanner;

public class CountTheDigit {
public static void main(String[] args) {
	int num,count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	num=sc.nextInt();
	if(num==0)
	{
		System.out.println("Number is not valid");
	}
	for(;num>0;)
	{
		count++;
		num=num/10;
	}
	System.out.println("No. of Digits: "+ count);
}

}
