package MyStr;

public class SearchingAnElementInStringArray 
{
public static void main(String[] args) {
	String cities[]= {"Chennai","Pune","Hyderabad","Delhi"};
	String search="Pune";
	
	for(int i=0;i<cities.length;i++)
	{
		if(cities[i]==search)
		{
		System.out.println("Pune Is Present");
		}
		}
}
}
