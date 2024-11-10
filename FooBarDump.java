public class FooBarDump {
	 public static void main(String[] args) {
	
		   int a = foo(6);//first the method call, evaluate, then assign to "a", "a" gets passed into bar(a) and evaluated, a is currently 4
		   int b = bar(a);//evaluate bar(a), careful that bar(a) has two evaluations, one is inside of a different method, bar(4), which is 5
		   
		   System.out.println(a + " value in a ");//prints 4 from method foo()
		   System.out.println(); 
		   System.out.println(b + " value in b");//print 5 from method bar(4)
		   
		 }
	 
	     //6 gets passed into the method foo
		 static int foo(int a) { //No access modifiers, why is that? Is this a real method or not? What am I looking at?
		   a = bar(a - 3); //another method call, bar(3), evaluate then assign to "a", returns 4, then assigns to "a"
		   System.out.println(a + " in method foo "); //print 4
		   return a; //return 4, a is currently 4
		 }
		 
		 //value 3 gets passed into method bar from inside foo() method call
		 static int bar(int a) {//No access modifiers, why is that? Is this a real method, or not? What am I looking at?
		   a = a - 1; //3 - 1 = 2, 2 is assigned to a
		   System.out.println(a + " in method bar ");//output value of a, which is 2, prints 2
		   return a + 2;//add 2 to a, becomes 4, return 4 from foo() call, from method bar(), prints 4
		 }
		}
