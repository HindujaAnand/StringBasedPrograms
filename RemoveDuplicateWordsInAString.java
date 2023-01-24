package thirty;

public class RemoveDuplicateWordsInAString
{
	public static void main(String[] args) 
	{
	String s="Java is a high level high level object oriented programming language"; 
	s=s.toLowerCase();
    String s1[]=s.split(" ");
    String x="";
    int count=0;
    for(int i=0;i<s1.length;i++)
    {
    	for(int j=i+1;j<s1.length;j++)
    	{
    		if(s1[i].equals(s1[j]))
    		{
    			count=count+1;
    		}
    	}  
    	if(count==0)
    	{
    		x=x+ s1[i] +" ";
    	}
    	count=0;
      }
    System.out.println(x);
}
}

