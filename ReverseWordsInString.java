package thirty;

public class ReverseWordsInString 
{
public static void main(String[] args) 
{
	String s="i am learning java";
	String a[]=s.split(" ");
	
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i] + " ");
	}
}
}
