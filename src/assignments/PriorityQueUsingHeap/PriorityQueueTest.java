package assignments.PriorityQueUsingHeap;
import java.util.Scanner;


public class PriorityQueueTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Priority Queue Test\n");   
 
        System.out.println("Enter size of priority queue ");
        PriorityQueue pq = new PriorityQueue(scan.nextInt() );
 
        char ch;
        /*  Perform Priority Queue operations */
        do    
        {
            System.out.println("\nPriority Queue Operations\n");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. display");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. clear");
            System.out.println("7. size");
 
            int choice = scan.nextInt();            
            switch (choice) 
            {
            case 1 : 
                System.out.println("Enter Name, RedID, EmailID, GPA and No of Units taken of a student");
                pq.insert(scan.next(), scan.next(), scan.next(),scan.nextFloat(), scan.nextInt());                     
                break;                          
            case 2 : 
                System.out.println("\nStudent removed \n\n"+ pq.remove()); 
                break;
            case 3 : 
                System.out.println("\nStudent Display : ");
                pq.display();
                break; 
            case 4 : 
                System.out.println("\nEmpty Status : "+ pq.isEmpty() );
                break; 
            case 5 : 
                System.out.println("\nFull Status : "+ pq.isFull() );
                break; 
            case 6 : 
                System.out.println("\nPriority Queue Cleared");
                pq.clear();
                break;    
            case 7 : 
                System.out.println("\nSize = "+ pq.size() );
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
