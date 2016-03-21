package vamsi;

import java.util.Scanner;

class Imethod
{
	void multiplication (int i, int j)
	{
		int value = i * j;
		System.out.println(value);
	}
}

public class InstanceMethod 
{
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.println("enter 2 integers");
		int x=in.nextInt();
		int y=in.nextInt();
		in.close();
		
		new Imethod().multiplication(x,y);
	}

}