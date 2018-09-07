package assignments.PriorityQueUsingHeap;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInsertStudentDetails {

	
	@Test
	public void TestInsertStudentDetails() {
		/*Idea:
		 * 1) Insert the student details using insertStudentDetails() function
		 * 2) insertStudentDetails() function returns the student object inserted.
		 * 3) Verify the student details using the data inserted manually and student object returned 
		 * 	  by insertStudentDetails() method using assertEquals() method 
		 * */
		
		PriorityQueue priorityQueueObj= new PriorityQueue(5);
		Student student1;
		student1=priorityQueueObj.insertStudentDetails("Student1_name","redID_1","student1@xyz.edu",(float)3.5,100);
		assertEquals("Student1_name", student1.getName());
		assertEquals("redID_1", student1.getRedID());
		assertEquals("student1@xyz.edu", student1.getEmailID());
		assertEquals(3.5, student1.getGpa(), 0);
		assertEquals(100, student1.getNoOfUnitsTaken());
	}

}
