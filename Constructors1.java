package OOPSConcept;

class p5
{
	int x;
	p5()
	{
		x=0;
		System.out.println("from constructors ");
		
	}
	p5(int y)
	{
	x=y;
	demo();
	}
	void call()
	{
		System.out.println("x is "+x);
	}
	void demo()
	{
		System.out.println("from demo");
	}
}

public class Constructors1 
{
public static void main(String args[])
{
	p5 p=new p5();
	p5 p1=new p5(120);
	p.call();
	p1.call();
}
}
