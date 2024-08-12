package OOPSConcept;
//storing super class in sub class


class bj
{
	void call()
	{
		System.out.println("from bj");
	}
}
	class cj extends bj
	{
		void call()
		{
			System.out.println("from cj");
		}
	}


public class abs_02 
{
	public static void main(String args[]) 
	{
	bj b=new cj();
	b.call();
	}

}
