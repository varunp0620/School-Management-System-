package schoolManagementSystem;
/*
 * many teachers, many students
 * created by varun on 19/02/23
 */

import java.util.ArrayList;
import java.util.List;


public class School {

	private List<TeachersClass> teach=new ArrayList<>();
	private List<Student> stud=new ArrayList<>();
	private static double tME;
	private static double tMS;
	/*
	 * @return the list of teachers in the school
	 */
	public List<TeachersClass> getTeach() {
		return teach;
	}
	/*
	 * adding teacher to the school
	 */
		public void addTeach(TeachersClass teacher) {
		teach.add(teacher);
	}
//	return list of the student in the school
	public List<Student> getStud() {
		return stud;
	}
//	add the students to the school
	public void addStud(Student student) {
		stud.add(student);
	}
//	returns total money earned
	public double gettME() {
		return tME;
	}
//	update the total money earned
	public static void updatetME(double tMEs) {
		tME += tMEs;
	}
//	get the total money spend
	public double gettMS() {
		return tMS;
	}
//	update the total money spend by the school
//	which is salary given to the teachers
	public static void updatetMS(double salary) {
		tME=tME-salary;
	}
	
	
	public School(List<TeachersClass> teach,List<Student> stud) {
		super();
		this.teach = teach;
		this.stud = stud;
		tME=0;
		tMS=0;
	}
	
		
 
}
