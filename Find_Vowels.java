package MyStr;

public class Find_Vowels 
{
public static void main(String[] args)
{
	String s="India is my Country";
    String s1=s.toLowerCase();
	char c[]=s.toCharArray();
	int count=0;
	for(int i=0;i<c.length;i++)
	{
	if(c[i]=='a'|| c[i]=='e'||c[i]=='o'||c[i]=='i'||c[i]=='u')
	{
		count=count+1;
		System.out.println(c[i]);
	}
}
	System.out.println("Vowels Count is " +count);
} 
}
