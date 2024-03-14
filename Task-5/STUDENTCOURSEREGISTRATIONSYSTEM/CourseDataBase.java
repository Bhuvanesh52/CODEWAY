package codeway.STUDENTCOURSEREGISTRATIONSYSTEM;

public class CourseDataBase {
 private String CourseInformation="",CourseCode="",title="";
 private int capacity=0,Slot=0;
 private String Description="",schedule="";
 CourseDataBase(String CourseInformation,String CourseCode,String title,int capacity,String Description,String schedule)
 {
	 this.CourseInformation=CourseInformation;
	 this.CourseCode=CourseCode;
	 this.title=title;
	 this.capacity=capacity;
	 this.Description=Description;
	 this.schedule=schedule;
	 this.Slot=capacity;
 }
public String getCourseInformation() {
	return CourseInformation;
}
public void setCourseInformation(String courseInformation) {
	CourseInformation = courseInformation;
}
public String getCourseCode() {
	return CourseCode;
}
public void setCourseCode(String courseCode) {
	CourseCode = courseCode;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public boolean setSlot(boolean Flag) {
	if(this.Slot<=0 && this.Slot>capacity) 
	{
		return false;
	}
	this.Slot=Flag?this.Slot-1:this.Slot+1;
	return true;

}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public String getSchedule() {
	return schedule;
}
public void setSchedule(String schedule) {
	this.schedule = schedule;
}
public void dispAll()
{
	System.out.println("************************************************");
	System.out.println("Title : "+this.title);
	System.out.println("CourseCode : "+this.CourseCode);
	System.out.println("CourseInformation : "+this.CourseInformation);
	System.out.println("Schedule : "+this.schedule);
	System.out.println("Slot Availabe : "+this.Slot);
	System.out.println("Total Capacity : "+this.capacity);
	System.out.println("************************************************");
}
}
