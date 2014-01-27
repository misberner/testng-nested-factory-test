package nestedfactorytest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SubTest1 {
	
	private final int id;

	public SubTest1(int id) {
		this.id = id;
	}
	
	@Test
	public void testSub1() {
		System.out.println("Invoking testSub1() for id " + id);
	}
	
	@DataProvider
	public Object[][] idProvider() {
		return new Object[][]{{id}};
	}
	
	@Factory(dataProvider = "idProvider")
	public SubTest2[] createSubTests(int thisId) {
		return new SubTest2[]{
			new SubTest2(thisId, 0),
			new SubTest2(thisId, 1)
		};
	}


}
