package assignments.PriorityQueUsingHeap;

public class Student {
	
	String name;
	String redID;
	String emailID;
	float gpa;
	int noOfUnitsTaken;

	public Student(String name, String redID, String emailID, float gpa, int noOfUnitsTaken) {
		this.name=name;
		this.redID=redID;
		this.emailID=emailID;
		this.gpa=gpa;
		this.noOfUnitsTaken=noOfUnitsTaken;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", redID=" + redID + ", emailID=" + emailID + ", gpa=" + gpa
				+ ", noOfUnitsTaken=" + noOfUnitsTaken + "]";
	}
	
	
	
	

}
