package homework;

public class HomeWorkTest {

	public static void main(String[] args) throws InterruptedException {

		HomeWorkRightClick obj = new HomeWorkRightClick();

		obj.setUp();

		obj.rightClickTest();

		obj.tearDown();
		
		HomeWorkDoubleClick obj1 = new HomeWorkDoubleClick();
		
		obj1.setUp();
		
		obj1.doubleClickTest();
		
		obj1.tearDown();

	}

}
