package assignments.PriorityQueUsingHeap;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDisplayStudentsInDescendingPriority {

	@Test
	public void TestDisplayStudentsInDescendingPriority() {
		/*Idea:
		 * 1) Insert 2 students details manually using insertStudentDetails() method with student 2 having
		 *    higher priority than student1
		 * 2) displayStudentsInDescendingPriority() method returns the array of students (sortedStudentArray)
		 *    based on the order they displayed
		 * 3) Verify whether 1st element in sortedStudentArray shows student2 information since it has higher
		 *    higher priority while 2nd element shows student 1 information
		 * */
		
		PriorityQueue priorityQueueObj= new PriorityQueue(5);
		Student student1,student2;
		Student[] sortedStudentArray;
		student1=priorityQueueObj.insertStudentDetails("Student1_name","ID_1","student1@xyz.edu",(float)3.5,100);
		student2=priorityQueueObj.insertStudentDetails("Student2_name","ID_2","student2@xyz.edu",(float)3.8,100);
		sortedStudentArray=priorityQueueObj.displayStudentsInDescendingPriority();
		assertEquals("Student2_name", sortedStudentArray[0].getName());
		assertEquals("Student1_name", sortedStudentArray[1].getName());
		
	}

}
