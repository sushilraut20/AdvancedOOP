package assignments.PriorityQueUsingHeap;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRemoveHighPriorityStudent {

	@Test
	public void TestRemoveHighPriorityStudent() {
		
		/*Idea:
		 * 1) Insert 2 students information manually using insertStudentDetails() method with student2 having
		 *    higher priority than student1
		 * 2) Remove an element from the queue using removeHighPriorityStudent()
		 * 3) removeHighPriorityStudent() returns the element removed
		 * 4) Check the priority of the element removed with the priority of student2(higher priority)
		 * */
		
		
		PriorityQueue priorityQueueObj= new PriorityQueue(5);
		Student student1,student2, removedStudent;
		student1=priorityQueueObj.insertStudentDetails("Student1_name","ID_1","student1@xyz.edu",(float)3.5,100);
		student2=priorityQueueObj.insertStudentDetails("Student2_name","ID_2","student2@xyz.edu",(float)3.8,100);
		removedStudent=priorityQueueObj.removeHighPriorityStudent();
		assertEquals((float)(3.8*0.30+100*0.70), (float)(removedStudent.getPriorityOfStudent()),0);
		
	}

}
