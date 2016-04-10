package collection;

import java.util.ArrayList;
import java.util.Collection;

public class StudentCollection {

	////////////////// variables /////////////////////

	private int id;
	private String fname;
	private String lname;
	private String email;
	private boolean studentActive;
	private int enrolledDate;

	//////////////// setters & getters ///////////////

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStudentActive() {
		return studentActive;
	}

	public void setStudentActive(boolean studentActive) {
		this.studentActive = studentActive;
	}
	
	public int getEnrolledDate() {
		return enrolledDate;
	}

	public void setEnrolledDate(int enrolledDate) {
		this.enrolledDate = enrolledDate;
	}

	////////////////// constructor ///////////////////

	public StudentCollection(int id, String fname, String lname, String email, boolean studentActive, int enrolledDate) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.studentActive = studentActive;
		this.enrolledDate = enrolledDate;
	}

	/////////////////// main /////////////////////////

	public static void main(String[] args) {
		
		Collection<StudentCollection> a = new ArrayList<>();

		a.add(new StudentCollection(7, "vamsi", "garikipati", "yahoo", true,2008));
		a.add(new StudentCollection(8, "mahesh", "yadav", "gmail", true,2015));
		a.add(new StudentCollection(9, "krishna", "kumar", "gmail", true,2005));
		a.add(new StudentCollection(10, "anand", "kumar", "gmail", true,2008));
		a.add(new StudentCollection(11, "venkata", "krishna", "gmail", true,2008));
		a.add(new StudentCollection(12, "hari", "kumar", "gmail", false,2015));

		for (StudentCollection aa : a)
			System.out.println(aa);

		//countCommonLname(a);
		//System.out.println("\n");
		System.out.println("\ncount of active students : ");
		countActiveStudents(a);
		System.out.println("\nname of active students as of year 2015 : ");
		nameActiveStudents2015(a);
		System.out.println("\nstudents with yahoo email id's : ");
		nameYahooEmail(a);
		System.out.println("\nhighest enrolled year : ");
		highestEnrollmentYear(a);
		
	}

	////////////////// methods //////////////////////

	private static void highestEnrollmentYear(Collection<StudentCollection> a) {
		int i=0;
		int[] arr = new int[a.size()];
		for (StudentCollection aa : a){
			arr[i]=  aa.getEnrolledDate();
			i++;
		}
		int count=1;int tempCount;
		int common = arr[0];
		int temp=0;
		for(int j=0;j<arr.length;j++){
			temp=arr[j];
			tempCount=0;
			for(int k=1;k<arr.length;k++){
				if(temp==arr[k])
					tempCount++;
			}
			if(tempCount>count)
			{
				common=temp;
				count=tempCount;
			}
		}
		System.out.println(common);
	}

	private static void countCommonLname(Collection<StudentCollection> a) {
		int i=0;
		String[] str = new String[a.size()];
		for (StudentCollection aa : a){
			str[i]=  aa.getLname();
			i++;
		}
		int count=0;int tempCount;
		String temp=null;
		for(int j=0;j<str.length;j++){
			temp=str[j];
			tempCount=0;
			for(int k=1;k<str.length;k++){
				if(temp==str[k])
					tempCount++;
			}
			if(tempCount>count)
				count=tempCount;
		}
		System.out.println(count);
	}

	private static void nameYahooEmail(Collection<StudentCollection> a) {
		for (StudentCollection aa : a) {
			if (aa.getEmail() == "yahoo")
				System.out.println(aa.fname + " " + aa.lname);
		}
	}

	private static void nameActiveStudents2015(Collection<StudentCollection> a) {
		for (StudentCollection aa : a) {
			if (aa.isStudentActive() == true && aa.getEnrolledDate() == 2015)
				System.out.println(aa.fname + " " + aa.lname);
		}
	}

	private static void countActiveStudents(Collection<StudentCollection> a) {
		int count = 0;
		for (StudentCollection aa : a) {
			if (aa.isStudentActive() == true)
				count++;
		}
		System.out.println(count);
	}

	@Override
	public String toString() {
		return Integer.toString(id) + " " + fname + " " + lname + " " + email + " " + Boolean.toString(studentActive);
	}

}