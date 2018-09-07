package assignments.PriorityQueUsingHeap;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIsStudentPriorityQueueFull {

	@Test
	public void TestIsStudentPriorityQueueFull() {
		
		/*Idea:
		 * 1) Create priorityQueue with capacity=2
		 * 2) Insert 2 students information manually using insertStudentDetails() method
		 * 3) Check whether the queue is Full using isFull() function
		 * */
		
		
		PriorityQueue priorityQueueObj= new PriorityQueue(2);
		Student student1, student2;
		student1=priorityQueueObj.insertStudentDetails("Student1_name","ID_1","student1@xyz.edu",(float)3.5,100);
		student2=priorityQueueObj.insertStudentDetails("Student2_name","ID_2","student2@xyz.edu",(float)3.8,100);
		boolean isStudentPriorityQueueFull=priorityQueueObj.isFull();
		assertEquals(true, isStudentPriorityQueueFull);
	}

}
