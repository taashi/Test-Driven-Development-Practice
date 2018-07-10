
public class BubbleSort {
//	public static int[] sort(int[] array)
//	{
//		return null;
//	
//	}
// this was the code first written to fail my 1 st TC. (firstTest)
//To pass my TC the below code was written

//	public static int[] sort(int[] array)
//	{
//		return array;
//	
//	}
	//The above code fails my 2nd TC.(secondTest)
	// To pass my TC the below code was written
//	public static int[] sort(int[] array)
//	{
//		if(array[0] > array[1])
//		{
//			int temp = array[1];
//			array[1] = array[0];
//			array[0] = temp;
//		}
//		return array;
//	}
	// The above code fails my 3rd TC.(thirdTest)
	//To pass my TC the below code was written
//	public static int[] sort(int[] array)
//	{
//		for(int i=1; i < array.length; i++)
//			
//		if(array[i-1] > array[i])
//		{
//			int temp = array[i];
//			array[i] = array[i-1];
//			array[i-1] = temp;
//		}
//		return array;
//	}
	// The above code fails my 4th TC.(thirdTest)
		//To pass my TC the below code was written which satisfies all my cases ( the 5th one too)
	public static int[] sort(int[] array)
	{
		for(int i=0;i < array.length -1; i++)
			for(int j = 0; j< array.length-1; j++)
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
							
				}
			}
		return array;
	}
}
