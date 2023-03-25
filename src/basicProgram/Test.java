package basicProgram;

class A{
	
	void m1() {
		System.out.println("hello from m1 of A");
	}
}


public class Test extends A {
	
	void m1() {
		System.out.println("hello from m1 of test");
	}
	public static void main(String[] args) {
		
//		String str = "heloo";
//		str.concat("World");
//		System.out.println(str);
		
//		A a = new A();
//		a.m1();
//		Test b = new Test();
//		b.m1();
//		A a = new Test(); 
//		a.m1(); 
		Test b = new A(); 
		b.m1();
		
	}
	

}
