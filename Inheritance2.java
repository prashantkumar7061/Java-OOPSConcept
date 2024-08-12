package OOPSConcept;
//
//class r1
//{
//	void call(int x,String test)
//	{
//		System.out.println(x+"  "+test);
//	}
//}
//
//class r2 extends r1
//{
//	void call()
//	{
//		System.out.println("from class r2");
//	}
//}
//
//public class Inheritance2
//{
//public static void main(String args[])
//{
//	r2 r=new r2();
//	r.call();
//	r.call(99,"hello Ranchi");
//}
//}

class r1
{
	int call()
	{
		System.out.println("from class b1");
		return 100;
	}
}

class r2 extends r1
{
	int call()
	{
		System.out.println("from class r2");
		System.out.println(super.call());
		return 1990;
	}
}

public class Inheritance2
{
public static void main(String args[])
{
	r2 r=new r2();
	System.out.println(r.call());
}
}