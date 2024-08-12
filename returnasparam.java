package OOPSConcept;

class p4
{
	int x=12;
	int callme(int p, int y)//return with parameter
	{
		System.out.println("x is "+x);
		return p+y+25+'a';
	}
}
public class returnasparam
{
public static void main(String args[])
{
	p4 p=new p4();
	System.out.println("value of return is "+p.callme(3,6));
	//p.callme();
	}
}
