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
		
		HomeWorkAddNewJob obj2 = new HomeWorkAddNewJob();
		
		obj2.setUp();
		
		obj2.addNewJob();
		
		obj2.tearDown();
		
		HomeWorkDragAndDrop obj3 = new HomeWorkDragAndDrop();
		
		obj3.setUp();
		
		obj3.dragAndDrop();
		
		obj3.tearDown();
		
		HomeWorkAddNewJob obj4 = new HomeWorkAddNewJob();
		
		obj4.setUp();
		
		obj4.addNewJob();
		
		obj4.tearDown();

	}

}
