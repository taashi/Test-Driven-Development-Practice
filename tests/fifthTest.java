import static org.junit.Assert.*;

import org.junit.Test;

public class fifthTest {
// This passes after implementing the code for the 4th iteration
	@Test
	public void sortUnsortedListofAnyLengthCheck()
	{
		assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8}, BubbleSort.sort(new int[] {8,4,2,6,1,5,0,7,3}));
	}

}
