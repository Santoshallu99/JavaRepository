
public class Child implements Parent1, Parent2 {
	void msg3() {
		System.out.println("i am a child");
	}
	
 public static void main(String[] args) {
	 Child childobj= new Child();
	 //grand parent method
	 childobj.show();
	 //parent1 method
	 childobj.msg1();
	 //parent2 method 
	 childobj.msg2();
	 //child class method
	 childobj.msg3();
		 
 }

}
