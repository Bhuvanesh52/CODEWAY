package codeway.STUDENTCOURSEREGISTRATIONSYSTEM;

import java.util.ArrayList;

public class CourseServices {
	static int ID=1;
	ArrayList<CourseDataBase> CDB=new ArrayList<CourseDataBase>();
	ArrayList<StudentDatabase> SDB=new ArrayList<StudentDatabase>();
	public CourseServices()
	{
		CDB.add(new CourseDataBase("ML - 2 Month's Course","ML2024","Machine Learning",30,"","Mon to Fri - 2.30 pm to 5.30 pm"));
		CDB.add(new CourseDataBase("DL - 3 Month's Course","DL2024","Deep Learning",30,"","Mon to Fri - 1.30 pm to 4.30 pm"));	
	}
	public void DisplayCourse()
	{
		for(CourseDataBase c:CDB)
		{
			c.dispAll();
		}
	}
	public void RegisterCourse(String StudentName,String MobileNumber,String RegisteredCourses)
	{
		for(CourseDataBase cdb:CDB)
		{
			if(cdb.getCourseCode().equals(RegisteredCourses) )
			{
				if(cdb.setSlot(true))
				{
				SDB.add(new StudentDatabase(StudentName,String.valueOf(ID++),MobileNumber,RegisteredCourses));
				System.out.println("************************************************");
				System.out.println("Your Student ID is : "+(ID-1));
				System.out.println("************************************************");
				}else {
					break;
				}
			}
		}
	}
	public void DropCourse(String StudnetId)
	{
		boolean flag=true;
		for(StudentDatabase sdb:SDB)
		{
			if(sdb.getStudnetId().equals(StudnetId))
			{
				for(CourseDataBase cdb:CDB)
				{
					if(sdb.getRegisteredCourses().equals(cdb.getCourseCode()))
					{
						cdb.setSlot(false);
						SDB.remove(sdb);
						System.out.println("Your Course Drop SuccessFully..");
						flag=false;
						break;
					}
				}
				break;
			}
		}
		if(flag)
		{System.out.println("Invalid Student Id");}
		
	}
	
	
	
}
