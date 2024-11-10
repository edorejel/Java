 class TestTwoMethodCalls {
	 public static void main(String[] args) {
		   foo(4);
		   bar(4);
		 }
	 //no access modifier means that method has package-private access
	 //static keyword means method belongs to the class itself, not to any specific instance of the class
		 static void foo(int a) {//Access modifiers are missing, why is that? What is happening here? Is this a method or not? Please explain...
		   System.out.print(a);
		 }
		 
		 static void bar(int a) {//Access modifiers are missing, why is that? What is happening here? Is this a method or not? Please explain...
		   foo(a + 1);
		   System.out.print(a);
		 }
		}

//Explain what is happening to the argument as it is passed into the parameters and processed by the methods.
