package assignments.PriorityQueUsingHeap;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIsStudentPriorityQueueEmpty {

	@Test
	public void TestIsStudentPriorityQueueEmpty() {
		/*Idea:
		 * 1) Insert 1 student information manually using insertStudentDetails() method
		 * 2) Remove that element from the queue
		 * 3) Check whether the queue is empty using isEmpty() function
		 * */
		
		
		PriorityQueue priorityQueueObj= new PriorityQueue(5);
		Student student1;
		student1=priorityQueueObj.insertStudentDetails("Student1_name","ID_1","student1@xyz.edu",(float)3.5,100);
		priorityQueueObj.removeHighPriorityStudent();
		boolean isStudentPriorityQueueEmpty=priorityQueueObj.isEmpty();
		assertEquals(true, isStudentPriorityQueueEmpty);
	}

}
