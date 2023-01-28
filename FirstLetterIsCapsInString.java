package MyStr;
public class FirstLetterIsCapsInString 
{
public static void main(String[] args) 
{
	String s="hinduja";
	char c[]=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
	if(i==0)
	c[i]=(char)((c[i]-32));
	System.out.print(c[i]);	
	}
}
}




