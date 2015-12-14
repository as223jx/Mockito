package mockito;

import org.junit.Test;
import org.mockito.Mockito;


public class HandleArrayTests {
	int[] testArray = { 1, 2, 3, 4 };
	
	@Test
	public void TestReturnSum() {
		HandleArray ha = Mockito.mock(HandleArray.class);
		ha.addValues();
		
		Mockito.verify(ha, Mockito.times(1)).addValues();
	}
}