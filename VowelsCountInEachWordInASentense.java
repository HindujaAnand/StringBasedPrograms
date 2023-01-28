package MyStr;
//Java program to count how many first letter of the every word is vowels in a given sentence
public class VowelsCountInEachWordInASentense 
{
public static void main(String[] args) 
{
String s="It always seems impossible until it's done";
s=s.toLowerCase();
String x[]=s.split(" ");
System.out.println("Total number of words " + x.length);
System.out.println("Total number of Space " + (x.length-1));
int count=0;
for(int i=0;i<x.length;i++)
{
	String name=x[i];
	System.out.println(name);
	char chararr[]=name.toCharArray();
	if(chararr[0]=='a'||chararr[0]=='e'||chararr[0]=='i'||chararr[0]=='o'||chararr[0]=='u'||chararr[name.length()-1]=='a'||chararr[name.length()-1]=='e'||chararr[name.length()-1]=='i'||chararr[name.length()-1]=='o'||chararr[name.length()-1]=='u')
	{
		count=count+1;
	}
}
System.out.println("Total Number of vowels in first letter of a word in a given sentense is :" +count);
}
}
