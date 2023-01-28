package MyStr;

public class UpperCaseAndLowerCase 
{
public static void main(String[] args) 
{
	String s="hiNduja";
    s=s.toUpperCase();
    char c[] = s.toCharArray();
    for ( int i=0; i<c.length ; i=i+2)
    {
      c[i] =(char) (c[i] + 32);
    }

   for(int i=0 ; i<c.length ; i++)
    {
          System.out.print(c[i]);
    }
   

  
}
}
