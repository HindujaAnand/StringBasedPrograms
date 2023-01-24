package thirty;

public class CountTheOccuranceOfEachCharacterInAString 
{
public static void main(String[] args) 
{
	String s="Hindujaanand";
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
	int count=0;
	for(int j=i+1;j<c.length;j++)
	{
	if(c[i]==c[j])
	{
	c[j]=' ';
	count=count+1;
	}
	}
	if(c[i]!=' ')
	{
		System.out.println(c[i]+" Character has "+count+" times");

	}
	
	
}	
}
}
