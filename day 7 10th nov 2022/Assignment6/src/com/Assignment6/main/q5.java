//5. Create a class A with the method dispmsg() which prints some message. Create one sub
//class of A with name B and override the dispmsg() function, also create one more
//subclass from B with name C and override the dispmsg() function in C also. In main
//invoke that function with the help of three class instances.
package com.Assignment6.main;

import com.Assignment6.Entity.A;
import com.Assignment6.Entity.B;
import com.Assignment6.Entity.C;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA = new A();
		B objB = new B();
		C objC = new C();
		objA.dismsg("hi");
		objB.dispmsg("hello");
		objC.dispmsg("hello from c");
	}

}
