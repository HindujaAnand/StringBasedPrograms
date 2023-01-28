package MyStr;

public class AscendingSortingInString 
{
  public static void main(String[] args) 
	{
	        
	   String s = "java";
	   char c[] = s.toCharArray();
	   char temp;
	   
	   for(int i=0;i<c.length;i++)
	   {
		   for(int j=i+1;j<c.length;j++)
		   {
			   if(c[i]>c[j])
			   {
				   temp=c[i];
				   c[i]=c[j];
				   c[j]=temp;
			   }
		   }   
	   }
	   System.out.println(c);
}
}

