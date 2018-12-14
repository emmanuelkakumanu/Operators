
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
		obj.Ar_Op(16,77);
	}
	void Ar_Op(int a,int b)
	{
		System.out.println("a+b :"+(a+b));
		System.out.println("a-b :"+(a-b));
		System.out.println("a*b :"+(a*b));
		System.out.println("a/b :"+(a/b));
	}
}
