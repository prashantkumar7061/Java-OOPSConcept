package OOPSConcept;
// finalkeyword- we cant change its velue.


class blk
{
	  void call()   //final void call() -"not work due to overriding.
	{
		System.out.println("from call in blk");
	}
}

class clk extends blk
{
	void call()
	{
		System.out.println("from clk");
	}
}
public class finalKeyword 
{
public static void main(String args[])
{
//	final int x=90;
//	System.out.println("x is "+x);
//	//x++;
//	System.out.println("final x is "+x*9);
	
	clk c=new clk();
	c.call();
}
}
