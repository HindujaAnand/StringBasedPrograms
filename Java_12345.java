package MyStr;

public class Java_12345 
{
	public static void main(String[] args) {
		
	
	//INPUT---> JAVA 12345
	//OUTPUT---> JaVa 12345 

	String s = "JAVA 12345";
	char c[] = s.toCharArray();
	for(int i = 0 ; i <c.length;i++)
	{
	    if(c[i]>=32 && c[i]<= 64)
	    {
	             System.out.print(c[i]);
	    }
	    
	    else
	    {
	    if(i%2==0)
	    {
	    	//Upper Case
	        System.out.print(c[i]);
	    }
	    else
	    {
	//Lower Case
    System.out.print((char)(c[i]+32));
	    }
	    }
	} 
	}
}
