package client;

public class arrayQuestion
{
	//Finds a certain value from an array and add them to another array

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] array= {2,4,1,4,5,1,2,10};
		int[] array2=new int[10];
		int foo=2;
		int i;
		int j=0;
		for(i=0;i<array.length;i++)
		{
			if (array[i]==foo)
			{
				array2[j]=array[i];
				j++;
			}
					
		}
	}

}
