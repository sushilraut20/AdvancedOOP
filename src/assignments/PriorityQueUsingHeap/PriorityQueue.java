package assignments.PriorityQueUsingHeap;

public class PriorityQueue {
	
	private Student[] studentHeap;
	private int heapSize, capacity;

	public PriorityQueue(int capacity) {
		this.capacity=capacity + 1;
		studentHeap= new Student[this.capacity];
		heapSize=0;
	}
	
	//Getters for class variables studentHeap, heapSize and capacity
	public Student[] getStudentHeap() {
		return studentHeap;
	}

	public int getHeapSize() {
		return heapSize;
	}

	public int getCapacity() {
		return capacity;
	}


	// Function to clear Student Priority Queue
    public void clear()
    {
    	studentHeap = new Student[capacity];
        heapSize = 0;
    }
    
    // Function to check if Student Priority Queue is empty
    public boolean isEmpty()
    {
        return heapSize == 0;
    }
    
    // Function to check if Student Priority Queue is Full
    public boolean isFull()
    {
        return heapSize == capacity - 1;
    }
   
    // Function to check the size of Student Priority Queue
    public int size()
    {
        return heapSize;
    }
    
    // Function to insert Student details in Student Priority Queue
	public Student insertStudentDetails(String name, String redID, String emailID, float gpa, int noOfUnitsTaken)
    {
        Student newStudent = new Student(name, redID, emailID, gpa, noOfUnitsTaken);
        
        /*Initially the heapSize= 0, so in that case below while loop will not work and element will get 
         stored at 1st place. For subsequent additions, the priority of that element will be checked with
         the parent element and their positions will be swapped if the priority of new element is higher 
         than the parent element
         */
        
        studentHeap[++heapSize] = newStudent;
        int position = heapSize;
        while (position != 1 && newStudent.getPriorityOfStudent() > studentHeap[position/2].getPriorityOfStudent())
        {
        	studentHeap[position] = studentHeap[position/2];
        	position /=2;
        }
        studentHeap[position] = newStudent;
        
        return newStudent;
    }
	
	
	// Function to remove High priority Student from Student Priority Queue
    public Student removeHighPriorityStudent()
    {
        int parent, child;
        Student firstStudentInHeap, lastStudentInHeap;
        if (isEmpty() )
        {
            System.out.println("Heap is empty");
            return null;
        }
 
        firstStudentInHeap = studentHeap[1];
        lastStudentInHeap = studentHeap[heapSize--];
        
        /*When a highest priority element in heap is removed, the last element takes place of that element,
         * which again is re-shuffled and placed in the heap according to its priority
         * 
         * */
 
        parent = 1;
        child = 2;
        while (child <= heapSize)
        {
            if (child < heapSize && studentHeap[child].getPriorityOfStudent() < studentHeap[child + 1].getPriorityOfStudent())
                child++;
            if (lastStudentInHeap.getPriorityOfStudent() >= studentHeap[child].getPriorityOfStudent())
                break;
 
            studentHeap[parent] = studentHeap[child];
            parent = child;
            child *= 2;
        }
        studentHeap[parent] = lastStudentInHeap;
 
        return firstStudentInHeap;
    }
    
    //Function to display Student records in descending order of their priority
    
    public Student[] displayStudentsInDescendingPriority()
    {
    		Student[] copyOfStudentHeap;
    		int size = heapSize;
    		copyOfStudentHeap = this.studentHeap.clone();
    		Student removedHighPriorityStudent;
    		Student[] sortedStudentArray= new Student[size];
    		int i = 0;
    		
    		/*IDEA:
    		 * 1) Original heap is cloned to temporary heap
    		 * 2) Original heapSize is stored in temporary size variable
    		 * 3) Now the highest priority elements in original heap are removed using removeHighPriorityStudent()
    		 *    and are displayed simultaneously. This method is called as long as the elements are present 
    		 *    in the queue
    		 * 4) At the end the original heap becomes empty, so the temporary heap (in step 1) is reassigned to
    		 *    original heap along with the heap-size (in step 2)
    		 * 5) A Student array sortedStudentArray is defined and returned for Unit Testing purpose. It stores
    		 *    the student objects in descending order of their priority
    		 */
    		
    		while(!(isEmpty())) 
    	 	{
    			removedHighPriorityStudent=removeHighPriorityStudent();
    			System.out.println(removedHighPriorityStudent.getName()+" "+removedHighPriorityStudent.getRedID());	
    			sortedStudentArray[i]=removedHighPriorityStudent;
    			i++;
    		}
    		
    		heapSize = size;
    		this.studentHeap = copyOfStudentHeap;
    		
    		return sortedStudentArray;
    }
}
