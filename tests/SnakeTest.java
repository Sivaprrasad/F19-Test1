import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SnakeTest {
	Snake s1;
	Snake s2;
	

	@Before
	public void setUp() throws Exception {
		s1 = new Snake("Peter", 10, "coffee");
		s2 = new Snake("Takis", 80, "vegetables");
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	// SivaPrasad Uppalapati - C0744659
	@Test
	public void testIsHealthyFunction() {

		boolean s2FavFood = s2.isHealthy();
		assertTrue("1", s2FavFood);
		
	}
		 
	

	// SivaPrasad Uppalapati - C0744659
	@Test
	public void testFitsInCageFunction() {
		boolean cageLength = s1.fitsInCage(20);
		if(getlength<cagelenghth )
		assertTrue("")
		
		
		
		
		
	}

}
