package MyStr;

public class LowerCaseToUpperCase
{
public static void main(String[] args) {
	String s= "Be the way you are ";
	char c[]=s.toCharArray();
for(int i=0;i<c.length;i++)
{
	if(c[i]>='a' && c[i]<='z')
	c[i]=(char)((int)c[i] - 32);
	System.out.print(c[i]);
	
}
}
}
