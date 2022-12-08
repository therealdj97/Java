package com.assignment12.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class q3 {

	public static void main(String[] args) {
		ExecutorService service =null;
		try {
			service = Executors.newFixedThreadPool(2);
			service.execute(() -> {
				try {
					int c=0;
					long j;
					for(long i=0;i<=100;i++){
						for( j=2;j<=i;j++){
							if(i%j==0)
	    					break;
						}
						if( j==i){ 
							c++;	
							System.out.println(c+"th" +" Prime no: = "+i);
						}	
					}	
					Thread.sleep(1500);
				} 
				catch (InterruptedException exc) {
					exc.printStackTrace();
				}
			});
			
			service.execute(() ->{
				
				try {
					long a=0,c,n=0;
					long b=1;
					while(n++<50){
						System.out.println(n+"th" +" Fib no: = "+a);
						c=a+b;
						a=b;
						b=c;
						}
					Thread.sleep(1500);
				}
				catch (InterruptedException exc) {
					exc.printStackTrace();
			}
		});
		
		service.execute(()-> {
			try {
			
		        long factorial = 1;
		        for(int i = 1; i <= 20; ++i)
		        {
		            factorial *= i;
		            System.out.println("Factorial of" + i+"="+factorial);
		        }
		        Thread.sleep(1500);
		    }
			catch (InterruptedException exc) {
				exc.printStackTrace();
			}
		});
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		if(service != null)
			service.shutdown();
		}
	}
}
