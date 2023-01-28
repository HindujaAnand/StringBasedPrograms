package thirty;

public class ReverseAString 
{
public static void main(String[] args) 
{
String s1="Hinduja"; 
char c[]=s1.toCharArray();

for(int i=c.length-1;i>=0;i--)
{
	System.out.print(c[i]);
}

}

}
