package codeway;

import java.util.Scanner;

import codeway.STUDENTCOURSEREGISTRATIONSYSTEM.CourseServices;

public class REGISTRATIONSYSTEM {

	static CourseServices CS=new CourseServices();
	static Scanner str=new Scanner(System.in);
	static void RegStudDb()
	{
		String StudentName="";
		String MobileNumber="",RegisteredCourses="";
		System.out.println("Enter Name");
		StudentName=str.next();
		System.out.println("Enter MobileNumber");
		MobileNumber=str.next();
		System.out.println("Enter Course Code");
		RegisteredCourses=str.next();
		CS.RegisterCourse(StudentName,MobileNumber,RegisteredCourses);
	}
	static void DropCourse()
	{
		String StudnetId="";
		System.out.println("Enter Student Id");
		StudnetId=str.next();
		CS.DropCourse(StudnetId);
	}
	public static void main(String[] args) {
		
		System.out.println("*****STUDENT COURSE REGISTRATION SYSTEM*****");
		Scanner sc=new Scanner(System.in);
		int Option=0;
		while(true)
		{
			System.out.println("Press 1 for Registration\nPress 2 for Course Drop\npress 3 for Course Listing");
			Option=sc.nextInt();
			switch(Option)
			{
			case 1://Register
				CS.DisplayCourse();
				RegStudDb();
				break;
			case 2://Drop Course
				DropCourse();
				break;
			case 3://List of Course
				CS.DisplayCourse();
				break;
			}
			if(!(Option>=1 && Option<=3))break;
		}
		System.out.println("Exit.....");
	}

}
