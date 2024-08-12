package OOPSConcept;


class ty 
{
	int  x=12;
	void call()
	{
		System.out.println("x is "+x);
		System.out.println("this x is  "+this.x);
		this.callme();
		callme();
	}
	void callme()
	{
		System.out.println("from call me ");
	}

}
public class Function3
{
public static void main(String args[])
{
	ty x=new ty();
	x.call();
}
}
