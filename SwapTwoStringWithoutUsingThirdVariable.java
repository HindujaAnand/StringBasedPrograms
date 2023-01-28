package thirty;

public class SwapTwoStringWithoutUsingThirdVariable 
{
public static void main(String[] args) {
	String s1="Hindu";
	String s2="Sai";
	System.out.println("Before Swapping value of s1 is  " +s1);
	System.out.println("Before Swapping value of s2 is  " +s2);
	s1=s1+s2;
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());	
	System.out.println("After Swapping value of s1 is  " +s1);
	System.out.println("After Swapping value of s2 is  " +s2);
}
}
