package MyStr;

public class Count_Words
{
public static void main(String[] args) 
{
String s="INDIA IS MY COUNTRY";

char c[]=new char[s.length()];
for(int i=0;i<c.length;i++)
{
	c[i]=s.charAt(i);
}
int words=1;
int search=' ';
for(int i=0;i<c.length;i++)
{
if(c[i]==search)
{
	words=words+1;
}
}
System.out.println(words);
}
}
