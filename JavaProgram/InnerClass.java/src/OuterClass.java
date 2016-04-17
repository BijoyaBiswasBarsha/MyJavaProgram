
public class OuterClass {
	   void my_Method(){
	   final int num=23;
	  // int num=23;
	   class MethodInner_Demo{
	      public void print(){
	         System.out.println("This is method inner class "+num);	   
	      }   
	   }
	   MethodInner_Demo inner=new MethodInner_Demo();
	   inner.print();
	   }
	
	public static void main(String[] args) {
		
		OuterClass outer =new OuterClass();
	      outer.my_Method();
	}

}
