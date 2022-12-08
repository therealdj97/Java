package com.assignment11.entity;

public class prime  implements Runnable{
	long j,c;
	public prime()
	{
		super();
		c=0;
	}
   	 public void run(){
    		for(long i=0;i<=100;i++)
    		{
    			for(j=2;j<=i;j++)
    			{
    				if(i%j==0)
    					break;
    			}
    			if(j==i)
    			{ 
    				c++;	
    				System.out.println(c+"th" +" Prime no: = "+i);
    			}
    		}
    	}
   	 }
