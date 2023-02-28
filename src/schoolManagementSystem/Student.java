package schoolManagementSystem;

public class Student {
      int rollNo;
      String name;
      String grade;
      double feesPaid;
      double feesTotal;
      
      public Student(int rollNo,String name,String grade) {
    	 this.rollNo=rollNo;
    	 this.name=name;
    	 this.grade=grade;
    	 this.feesPaid=0;
    	 this.feesTotal=30000;
    	 
      }

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public double getFeesPaid() {
		return feesPaid;
	}

	public double getFeesTotal() {
		return feesTotal;
	}

	public void setGrade(String grade) {
		this.grade=grade;
	}
      
    public void updateFeesPaid(int feez) {
    	feesPaid=feesPaid+feez;
    	School.updatetME(feesPaid);
    	
    }
      
      
      
	
}
