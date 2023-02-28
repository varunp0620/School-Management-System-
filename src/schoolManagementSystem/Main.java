package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
	TeachersClass latha=new TeachersClass(1,"latha",200);
	TeachersClass smitha=new TeachersClass(1,"latha",400); 
	List<TeachersClass> teach=new ArrayList<>();
	teach.add(smitha);
	teach.add(latha);
	Student varun=new Student(1, "varun", "12");
	Student ak=new Student(1, "AK", "12");
	List<Student> student=new ArrayList<>();
	student.add(ak);
	student.add(varun);
	
	School sms=new School(teach, student);
	ak.updateFeesPaid(5000);
	ak.updateFeesPaid(15000);
	System.out.println("total amount earned by school is $"+sms.gettME());
	
	latha.receiveSal(latha.getSalary());
	System.out.println("SMS has spent salary to"+latha.getName()+"and now has"+sms.gettME());
	
	
}
}
