package OOPSConcept;
// we can only use interface(super class) fns.


class j1 implements abs
{
	public void demo()
	{
		System.out.println("from demo");
	}
	void call()
	{
		System.out.println("from call");
	}
}
public class abs_01 
{
public static void main(String args[])
{
	abs a=new j1();
	a.demo();
}
}
