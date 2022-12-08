package com.assignment11.entity;

public class fibo implements Runnable {long a,b,c,n;
public fibo()
{
	a=c=n=0;
	b=1;
}
public void run()
{
	while(n++<50)
	{
		System.out.println(n+"th" +" Fib no: = "+a);
		c=a+b;
		a=b;
		b=c;
		try
		{
			if(n==25)
			{
				System.out.println("Thread fibonacci is put into sleep.");
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Error : " + e);
		}
	}	
}

}
