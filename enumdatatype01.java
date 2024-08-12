package OOPSConcept;
//enum is a derived data type
//numbers can't be defined in enum.



enum days
{
	mon,tue,wed,fri,sat,sun
}

public class enumdatatype01
{
public static void main(String args[])
{
	days d=days.fri;
	System.out.println("day is "+d);
	System.out.println(d.ordinal());//ordinal is index no. of the enum
	
	for(days x:days.values())
		System.out.println(x);
}
}
