package com.obsqura.JavaTraining.pack1;

public class Sum 
{

	public void Sum(int a,int b)
	{
		int num1,num2,sum;
		num1=a;
		num2=b;
		sum=a+b;
		System.out.println("Sum is "+sum);
	}
	public void Sum(float a,float b)
	{
		float num1,num2,sum;
		num1=a;
		num2=b;
		sum=a+b;
		System.out.println("Sum is "+sum);
	}
	public static void main(String[] args) 
	{

       Sum s1 = new Sum();  
       s1.Sum(10,20);
       s1.Sum(50f,100f);

	}

}
