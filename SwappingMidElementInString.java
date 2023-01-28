package MyStr;

public class SwappingMidElementInString 
{
public static void main(String[] args) {
	String s="hindu";
	  char temp;
	  int index1,index2;
	  char a[]=s.toCharArray();
	  if(a.length % 2 == 0)
	  {
	       index1 = (a.length / 2)-1;
	       index2 = (a.length / 2);
	       temp = a[index1];
	       a[index1] = a[index2];
	       a[index2] = temp;
	       for (int i=0; i<a.length; i++)
	       {
	    System.out.print(a[i]);
	       }
	  }
	  else
	  {
	    index1 = (a.length / 2)-1;
	    index2 = (a.length / 2);
	    temp = a[index1];
	    a[index1] = a[index2];
	    a[index2] = temp;
	      
	    for (int i=0; i<a.length; i++)
	      {
	        System.out.print(a[i]);
	      }
	  }
}
}
