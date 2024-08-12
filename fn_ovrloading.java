package OOPSConcept;

class tty 
{
	void call()
	{
		System.out.println("from call");
		
	}
	void call(int x)
	{
		System.out.println("x is "+x);
	}
}

public class fn_ovrloading 
{
	public static void main(String args[])
	{
	tty x=new tty();
	x.call();
	x.call(2);
	}
}
