


public class Child extends Parent {
	public  void m1() 
	{
		
		System.out.println("this is child class m1 method");
	}
	public static void m2 ()
	{
		System.out.println("this is child class m2 method");
	}
	public static void main(String[] args) {
		Parent pt= new Parent();
		pt.m1();//this is parent class m1 method
		Child cd= new Child ();
		cd.m1();//this is child class m1 method
		cd.m2();//child class m2 method
		Parent p= new Child();
		p.m1();//this is child class m1 method
//		  Child c= (Child)new Parent();
//		  c.m1();
		  Child c1= new Child();
		  c1.m1();
		
}

}
