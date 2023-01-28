package MyStr;

public class Find_Space
{
public static void main(String[] args)
{
	String s="India is my Country";
	char c[]=s.toCharArray();
	int space=0;
	for(int i=0;i<c.length;i++)
	{
		if(c[i]==' ')
	{
		space=space+1;
	}
    }
	System.out.println(space);
}
}
