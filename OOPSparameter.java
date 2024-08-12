package OOPSConcept;
//object  pass as a parameter....
class p2
{
	void call(p2 xyz)
	{
		System.out.println("from call ");
	}
}
public class OOPSparameter 
{
public static void main(String args[])
{
	p2 p=new p2();
	p.call(p);
}
}
