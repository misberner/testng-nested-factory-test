package nestedfactorytest;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class RootTest {
	
	@Test
	public void testRoot() {
		System.out.println("Invoking testRoot()");
	}
	
	@Factory
	public SubTest1[] createSubTests() {
		return new SubTest1[]{
				new SubTest1(0),
				new SubTest1(1)
			};
	}
}
