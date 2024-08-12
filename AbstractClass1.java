package OOPSConcept;


abstract class ran
{
	abstract void demo();
	void show()
	{
		System.out.println("from show");
	}
}

class p11 extends ran 
{
	void demo()
	{
		System.out.println("from p11");
	}
}

class p12 extends ran
{
	void demo()
	{
		System.out.println("from p22");
	}
}
public class AbstractClass1 
{
public static void main(String args[])
{
	ran r;
p11 p=new p11();
p12 pp=new p12();
r=p;
r.demo();
r.show();
r=pp;
r.demo();
r.show();
}
}
