import static org.junit.Assert.*;

import org.junit.Test;

public class fourthTest {
	//This will fail even though the code for unsorted array length of 3 has been implemented
	//but the code does not support a second iteration due to which it fails

	@Test
	public void sortUnsortedListofAnyLength()
	{
		assertArrayEquals(new int[] {0,1,2}, BubbleSort.sort(new int[] {2,1,0}));
	}


}
