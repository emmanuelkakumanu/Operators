
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Ideone obj=new Ideone();
		obj.Inc_Dec(16,77);
	}
	void Inc_Dec(int a,int b)
	{
		System.out.println("a++ : "+(a++));
		System.out.println("b++ : "+(b++));
		System.out.println("--a : "+(--a));
		System.out.println("b-- : "+(b--));
	}
}
