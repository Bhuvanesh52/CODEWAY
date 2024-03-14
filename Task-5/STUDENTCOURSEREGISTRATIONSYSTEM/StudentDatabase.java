package codeway.STUDENTCOURSEREGISTRATIONSYSTEM;

public class StudentDatabase {
	private String StudentName="",StudnetId="";
	private String MobileNumber="",RegisteredCourses="";
	StudentDatabase(String StudentName,String StudnetId,String MobileNumber,String RegisteredCourses)
	{
		this.StudentName=StudentName;
		this.StudnetId=StudnetId;
		this.MobileNumber=MobileNumber;
		this.RegisteredCourses=RegisteredCourses;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudnetId() {
		return StudnetId;
	}
	public void setStudnetId(String studnetId) {
		StudnetId = studnetId;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getRegisteredCourses() {
		return RegisteredCourses;
	}
	public void setRegisteredCourses(String registeredCourses) {
		RegisteredCourses = registeredCourses;
	}
	
}
