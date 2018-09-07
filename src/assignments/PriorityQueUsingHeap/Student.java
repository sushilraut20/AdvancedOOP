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
	
	
	public String getName() {
		return name;
	}


	public String getRedID() {
		return redID;
	}
	
	
	public String getEmailID() {
		return emailID;
	}


	public float getGpa() {
		return gpa;
	}


	public int getNoOfUnitsTaken() {
		return noOfUnitsTaken;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", redID=" + redID + ", emailID=" + emailID + ", gpa=" + gpa
				+ ", noOfUnitsTaken=" + noOfUnitsTaken + "]";
	}
	
	public double getPriorityOfStudent() {
		return (double)(0.7*noOfUnitsTaken + 0.3*gpa);
	}

}
