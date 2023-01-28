package MyStr;

public class UpCaseAndLowCaseInString
{
public static void main(String[] args) {
	String s="hinduJa";
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if(i%2==0)
		{
			c[i]=(char)((int)c[i]-32);
			System.out.print(c[i]);
		}
		else
		{
			System.out.print(c[i]);
		}
	}
}
}
