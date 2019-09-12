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
	public void testIsUnHealthyFunction() {

		boolean s1FavFood = s1.isHealthy();
		assertFalse("0", s1FavFood);
		
	}
		 

	// SivaPrasad Uppalapati - C0744659
	@Test
	public void testSnakeFitsInCageFunction() {
		//Given Snakelength < Cagelength which becomes fits case
		boolean s1Fits = s1.fitsInCage(20);
		assertTrue("1", s1Fits);
		
	}
	
	// SivaPrasad Uppalapati - C0744659
		@Test
		public void testSnakeDoesnotFitsInCageFunction() {
			//Given Cagelength  same as Snake length which does not fits case
			boolean s2DoesnotFits = s2.fitsInCage(80);
			assertFalse("0", s2DoesnotFits);
			
		}

}
