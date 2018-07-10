import static org.junit.Assert.*;

import org.junit.Test;

public class firstTest {

	//I removed the test case that is given by default by Junit.
	// Then I wrote a test case such that when i give a sorted list of length 2 to my sort 
	//function then it returns the same array to me. In my main class the BubbleSort class,
	//there is a method called sort which is called which returns a null value initially.
	//Refer code in main class
	@Test
	
	public void sortSortedList()
	{
	assertArrayEquals(new int[] {0,1}, BubbleSort.sort(new int[] {0,1}));
	}
//	public void sortUnsortedListofLengthTwo()
//	{
//		assertArrayEquals(new int[] {0,1}, BubbleSort.sort(new int[] {1,0}));
//	}

}
