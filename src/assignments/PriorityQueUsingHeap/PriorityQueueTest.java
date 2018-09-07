package assignments.PriorityQueUsingHeap;
import java.util.Scanner;


public class PriorityQueueTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Priority Queue Test\n");   
 
        System.out.println("Enter size of priority queue ");
        PriorityQueue studentPriorityQueue = new PriorityQueue(scan.nextInt() );
 
        char ch = 0;
        /*  Perform Priority Queue operations */
        do    
        {
            System.out.println("\nPriority Queue Operations\n");
            System.out.println("1. insert student details in priority Queue");
            System.out.println("2. remove high priority student from Student priority Queue");
            System.out.println("3. display all students in decending order of their priority");
            System.out.println("4. check if Student priority Queue is empty");
            System.out.println("5. check if Student priority Queue is full");
            System.out.println("6. clear Student priority queue");
            System.out.println("7. size of Student priority Queue");
 
            int choice = scan.nextInt();            
            switch (choice) 
            {
            case 1 : 
                System.out.println("Enter Name, RedID, EmailID, GPA and No of Units taken of a student");
                String name=scan.next();
                String redID=scan.next();
                String emailID= scan.next();
                float gpa=scan.nextFloat();
                		if(!(0.0<=gpa && gpa<=4.0)) {
                			System.out.println("Please enter valid GPA (0<= GPA <=4)");
                			break;
                		};
                	int noOfUnitsTaken=scan.nextInt();
                		if(!(0<=noOfUnitsTaken && noOfUnitsTaken<=150)) {
                			System.out.println("Please enter valid No of Units (0<= No of Units <=4)");
                			break;
                		};
                
                		studentPriorityQueue.insertStudentDetails(name, redID, emailID,gpa, noOfUnitsTaken);                     
                break;                          
            case 2 : 
                System.out.println("\nStudent removed \n\n"+ studentPriorityQueue.removeHighPriorityStudent()); 
                break;
            case 3 : 
                System.out.println("\nStudent Display : ");
                studentPriorityQueue.displayStudentsInDescendingPriority();
                break; 
            case 4 : 
                System.out.println("\nEmpty Status : "+ studentPriorityQueue.isEmpty() );
                break; 
            case 5 : 
                System.out.println("\nFull Status : "+ studentPriorityQueue.isFull() );
                break; 
            case 6 : 
                System.out.println("\nPriority Queue Cleared");
                studentPriorityQueue.clear();
                break;    
            case 7 : 
                System.out.println("\nSize = "+ studentPriorityQueue.size() );
                break;         
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }    
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');

	}

}
