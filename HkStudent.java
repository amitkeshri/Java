//HkStudent.java
import java.util.Scanner;
class HkStudent { 
	int sno;
	String sname;
	String course;
	double fee;
	String branch;
	
	void get() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the student no::");
		sno=sc.nextInt();
		System.out.println("enter the student name::");
		sname=sc.next();
		System.out.println("enter the student course::");
		course=sc.next();
		System.out.println("enter the student fee::");
		fee=sc.nextDouble();
		System.out.println("Enter the Student Branch::");
		branch=sc.next();
	}
	
	void display() {
		System.out.println("SNO:"+sno);
		System.out.println("SNAME:"+sname);
		System.out.println("COURSE:"+course);
		System.out.println("FEE:"+fee);
		System.out.println("Branch:"+branch);
	}

}
