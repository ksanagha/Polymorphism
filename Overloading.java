package practice4;
 public class Overloading{
	public void m1(int a,int b) {
		System.out.println(a+b);
	}
	public void    m1(int a,int b,int c) {
	
		System.out.println(a+b+c);
		//return a+b+c;
	}



	public static void main(String[] args) {
		Overloading a1=new Overloading();//A class object creating
		a1.m1(10, 20);//calling method and pass the valus
		a1.m1(29, 28,20);
		/*
		 * B a2=new B(); a2.m1(10);
		 */
		
	}

}
