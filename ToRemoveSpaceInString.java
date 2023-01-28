package MyStr;

public class ToRemoveSpaceInString 
{
public static void main(String[] args) 
{		
String s= "Hindu Sai Shyam Surekha Sharmi Rajesh Kishore Purushoth PriyaAkka";
char c[]=s.toCharArray();
for(int i=0;i<s.length();i++)
{
if(c[i]!=' ')
{
System.out.print(c[i]);
}
}
}
}