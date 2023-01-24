package thirty;

public class CountNumberOfDuplicateWordsInAString 
{
public static void main(String[] args) 
{
String s="and and it it the that the and and";
s=s.toLowerCase();
String a[]=s.split(" ");
int sum=0,count=0;

for(int i=0; i<a.length; i++)
{
  for(int j=i+1;j<a.length; j++)
  {
    if(a[i].equals(a[j]))
    {
      sum=sum+1;
      a[j]="0";
    }
  }
  if(sum>0 && a[i]!="0")
  {
    count=count+1;
  }
  sum=0;
}
System.out.println(count);
}
}

