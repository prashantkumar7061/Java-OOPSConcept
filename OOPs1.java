package OOPSConcept;
//Encapsulation:- data and method binding is called Encap.
//Abstraction:- hiding the data.
//Polymorphism
//Inheritance

class p1
{
	 int x=12; //class/Instance/global variable.
	static int z=120; // instance variable always global
	final int p=99;// never be reassigned.
	void call()
	{
		//int y=90;//local variable
		System.out.println("x in p1 "+x);
		System.out.println("x in p1 "+p*9);
	}
}

public class OOPs1
{
public static void main(String args[])
{
	p1 p=new p1();
	p.call();
	new p1().call();
	//System.out.println(p.x);
	System.out.println(p.x);
	System.out.println(p1.z);
	System.out.println(Math.sqrt(900));
	System.out.println(p);
}
}
