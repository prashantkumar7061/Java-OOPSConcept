package OOPSConcept;

class r8 implements Inhr3,Inhr32
{
    public  void call()
	{
		System.out.println("from call");
	}
	 void show()
	{
		System.out.println("hello show");
	}
	public void demo()
	{
		System.out.println("from demo");
	}
}

public class Inhertance3c 
{
public static void main(String args[])
{
	r8 c=new r8();
	c.call();
	c.show();
	c.demo();
}
}
