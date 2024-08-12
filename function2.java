package OOPSConcept;

class t
{
	void call(int x, int y)
	{
		System.out.println(x+y);
	}
	void show(Integer i, String s)
	{
		System.out.println(i);
		System.out.println(s);
	}
	void demo(int a[], Double d[])
	{
		for(int x:a)
			System.out.println(x);
		for(double x:d)
			System.out.println(x);
	}
}

public class function2 
{
 public static void main(String args[])
{
	t q=new t();
	q.call(2,90);
	q.show(12, "Ranchi city");
	int []pp= {12,33,44,55};
	Double dx[]= {11.45,33.67};
	q.demo(pp, dx);
	
}
}
