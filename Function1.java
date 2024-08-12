package OOPSConcept;

class r11
{
	void call()
	{
		System.out.println("from call");
		show();
	}
	void show()
	{
		System.out.println("from show");
		demo();
	}
	void demo()
	{
		System.out.println("from demo");
	}
}

public class Function1 
{
public static void main(String args[])
{
	r11 r=new r11();
	r.call();
	r.show();
	r.demo();
}

}
