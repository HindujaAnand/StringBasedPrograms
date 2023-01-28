package MyStr;

public class Encryption {
public static void main(String[] args) {
	String password="Hindu";
	char c[]=new char[password.length()];
	
	for(int i=0;i<c.length;i++)
	{
		c[i]=(char)(password.charAt(i)+5);
		
	}
	String s=String.valueOf(c);
	System.out.println(s);
}
}
