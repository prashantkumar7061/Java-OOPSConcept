package OOPSConcept;


class b1
{
	int x=900;
	void call()
	{
		System.out.println("x is "+x);
		
	}
	void caller()
	{
		System.out.println("from caller of super");
	}
}

class a1 extends b1
{
	int x=99;
	void demo()
	{
		System.out.println("x in a1 "+x);
		System.out.println("this x is a1 "+this.x);
		System.out.println("super x is in a1 "+super.x);
		super.call();
	}
}

public class Inheritance1 
{
public static void main(String args[])
{
	a1 b=new a1();
	System.out.println(b.x);
	b.call();
	b.demo();
	b.caller();
}
}
