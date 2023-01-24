package thirty;

public class TotalNumberOfWordsInAString
{
	public static void main(String[] args)
	{
		String s="Java is a high level object oriented programming language";
		s=s.toLowerCase();
		System.out.println("covereted a strig to lowercase : "+s);
		System.out.println("Replaced a with @ " +s.replace('a', '@'));
		char c[]=new char[s.length()];
		int words=1,vowels =0;
		for(int i=0;i<c.length;i++)
		{
			c[i]=s.charAt(i);
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
			{
				words=words+1;
			}
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				vowels=vowels+1;
				
			}
		}
		System.out.println("Total number of words in a string :" +words);
		System.out.println("Total number of characters in a string :"+ s.length());
		System.out.println("Total no of vowels count in a string: " + vowels);
	}
}
