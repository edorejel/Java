class Foo {
  
  public int i = 73;//what type of scope is this, explain what is happening to the variable throughout the program
   
  public Foo(int i) {
       this.i = i;
   }
  
  public static void main(String[] args){
     /*briefly explain what is happening in memory at this location in the program, start your explanation from here   
     Foo x = new Foo(23), 
          y = new Foo(59);
     */end your explanation here
        x.i = y.i;
        y.i = 67;
        System.out.println(x.i);
   }
}
