package assignments.PriorityQueUsingHeap;

public class PriorityQueue {
	
	private Student[] heap;
	private int heapSize, capacity;

	public PriorityQueue(int capacity) {
		this.capacity=capacity + 1;
		heap= new Student[this.capacity];
		heapSize=0;
	}
	
	/** function to clear **/
    public void clear()
    {
        heap = new Student[capacity];
        heapSize = 0;
    }
    /** function to check if empty **/
    public boolean isEmpty()
    {
        return heapSize == 0;
    }
    /** function to check if full **/
    public boolean isFull()
    {
        return heapSize == capacity - 1;
    }
    /** function to get Size **/
    public int size()
    {
        return heapSize;
    }
    
    /** function to insert student **/
	public void insert(String name, String redID, String emailID, float gpa, int noOfUnitsTaken)
    {
        Student newStudent = new Student(name, redID, emailID, gpa, noOfUnitsTaken);
 
        heap[++heapSize] = newStudent;
        int pos = heapSize;
        while (pos != 1 && newStudent.getPriorityOfStudent() > heap[pos/2].getPriorityOfStudent())
        {
            heap[pos] = heap[pos/2];
            pos /=2;
        }
        heap[pos] = newStudent;    
    }
	
	
	/** function to remove student **/
    public Student remove()
    {
        int parent, child;
        Student student, temp;
        if (isEmpty() )
        {
            System.out.println("Heap is empty");
            return null;
        }
 
        student = heap[1];
        temp = heap[heapSize--];
 
        parent = 1;
        child = 2;
        while (child <= heapSize)
        {
            if (child < heapSize && heap[child].getPriorityOfStudent() < heap[child + 1].getPriorityOfStudent())
                child++;
            if (temp.getPriorityOfStudent() >= heap[child].getPriorityOfStudent())
                break;
 
            heap[parent] = heap[child];
            parent = child;
            child *= 2;
        }
        heap[parent] = temp;
 
        return student;
    }
}
