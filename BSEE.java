package superclasstry;

import java.io.IOException;

public class BSEE extends student {

	String teacherNM, teacherDept;
	private GradeClass FinalGrade;
	
	public BSEE(String lname, String fname, int age, String addr, String telnum,
		String teacherNM, String teacherDept, GradeClass fingrd) throws NumberFormatException, IOException{
		
		super(lname, fname, age, addr, telnum);
		this.teacherNM = teacherNM;
		this.teacherDept = teacherDept;
		FinalGrade = fingrd;
	}
	
	public BSEE(String scode, String ycode, String ccode) {
		super(scode,ycode,ccode);
	}
	
	public String DisplayStudentInfo() {
		return String.format("\n\nInstructor: %s\nTeacher Department: %s\n\nSTUDENT INFO: %s",
				teacherNM,teacherDept,StudentPersonalInfo());
	}
	
	public String DisplayCourseInfo() {
		return String.format("COURSE INFO: %s\n", CourseInfo());
	}
	
	public String getCcodes(){
		return getCcode();
	}
	
	public String getYcodes(){
		return getYcode();
	}
	
	public String toString() {
		return String.format("GRADE INFO:\nYour Grade: %s", FinalGrade);
	}
	
}
