package schoolManagementSystem;

public class TeachersClass {
 private int id;
 private String teacherName;
 private double salary;
 private double salEarn;
 public double getSalary() {
	return salary;
}
 public int getId() {
	 return this.id;
 }


public TeachersClass(int id,String teacherName, double sal) {
	 this.id=id;
	 this.teacherName=teacherName;
	 salary=sal;
	 this.salEarn=0;
 }
 
 public String getName() {
	 return this.teacherName;
 }
 
 public void setSalary(double salary) {
	 this.salary=salary;
 }
 public double getSalEarn() {
	 return salEarn;
 }
 public void receiveSal(double salary) {
	 this.salEarn+=salary;
	School.updatetMS(salary);
 }
}
