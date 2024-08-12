package OOPSConcept;
//Variable argument as a parameter
//when argument is not fixed

class rr 
{
	void call(int ...args)
	{
		for(int a:args)
		{
			System.out.println(a+" ");
		}
	}
	
}

public class varAsParam 
{
	public static void main(String args[])
	{
		rr r=new rr();
		int data[]= {12,33};
		int kk[]= {32,55,66,44,90};
		r.call(kk);
		r.call(data);
	}
}
