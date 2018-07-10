import static org.junit.Assert.*;

import org.junit.Test;

public class thirdTest {
	//This will fail since the code for Unsorted Array of length 3  has not been implemented

	@Test
	public void sortUnsortedListofLengthThree()
	{
		assertArrayEquals(new int[] {0,1,2}, BubbleSort.sort(new int[] {0,2,1}));
	}

}
