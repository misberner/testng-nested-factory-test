package nestedfactorytest;

import org.testng.annotations.Test;

public class SubTest2 {
	
	private final int parentId;
	private final int id;
	
	public SubTest2(int parentId, int id) {
		this.parentId = parentId;
		this.id = id;
	}

	@Test
	public void testSub2() {
		System.out.println("Invoking testSub2 for id " + parentId + " - " + id);
	}

}
