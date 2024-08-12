package OOPSConcept;

class p3
{
	int x=12;
	int callme()
	{
		System.out.println("x is "+x);
		return x+x+25+'a';
	}
}
public class objAsParam
{
public static void main(String args[])
{
	p3 p=new p3();
	System.out.println("value of return is "+p.callme());
	//p.callme();
	}
}
