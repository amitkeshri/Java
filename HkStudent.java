//HkStudent.java
import java.util.Scanner;
class HkStudent { 
	int sno;
	String sname;
	String course;
	double fee;
	
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
	}
	
	void display() {
		System.out.println("SNO:"+sno);
		System.out.println("SNAME:"+sname);
		System.out.println("COURSE:"+course);
		System.out.println("FEE:"+fee);
	}

}
