import static org.junit.Assert.*;

import org.junit.Test;
//This will fail since the code for Unsorted Array has not been implemented

public class secondTest {

	@Test
	public void sortUnsortedListofLengthTwo()
	{
		assertArrayEquals(new int[] {0,1}, BubbleSort.sort(new int[] {1,0}));
	}

}
