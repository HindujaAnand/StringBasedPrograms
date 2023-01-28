package MyStr;

public class UpperCaseToLowerCase {
	public static void main(String[] args) {
		String s= "HINDUJA";
		char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if(c[i]>='A' && c[i]<='Z')
		{
		c[i]=(char)((int)c[i]+32);
		System.out.print(c[i]);
		}
		
	}
}
}
