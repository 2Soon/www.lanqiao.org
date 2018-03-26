/*333*/
package ю╤ге;

public class XH3 {
	public static boolean isSameString(String s1,String s2)
	{
		return s1.equals(s2);
	}
	public static boolean f(String s1,String s2)
	{
		if(s1.length()!=s2.length())  return false;
		if(s1.length()==0)	return true;
		if(s1.charAt(0)!=s2.charAt(0))	return false;
		return f(s1.substring(1), s2.substring(1));
		
		
	}
	public static void main(String[] args)
	{
		System.out.println(isSameString("aswd","aswd"));
		System.out.println(isSameString("aswd","Aswd"));
		System.out.println(f("sss","rrr"));
	}

}