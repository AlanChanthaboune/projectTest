package client;

public class StringVowel
{

	public static void main(String[] args)
	{
		StringVowel s=new StringVowel();
		s.stringParse("HellO");
		s.stringParse("there is a quiet Mouse");
		s.stringParse("I am happy");
	}
	public void stringParse(String word)
	{
		int vowelInc=0;
		int constInc=0;
		int i;
		int j;
		word=word.toUpperCase();
		for(i=0;i<word.length();i++)
		{
			char wordChar=word.charAt(i);
			if(wordChar=='A'||wordChar=='E'||wordChar=='I'||wordChar=='O'||wordChar=='U'||wordChar=='Y')
			{
				vowelInc++;
			}
			else if(wordChar==' ')
			{
				
			}
			else
			{
				constInc++;
			}
			
		
		
		}
		System.out.println("The number of vowels is "+vowelInc+" and the number of consonats are "+constInc);
	}
}

