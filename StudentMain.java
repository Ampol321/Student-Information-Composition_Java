package superclasstry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		String lname = null, fname = null, addr = null, telnum = null,
				tcNM = null, tcDept = null;
		String scode = null, ycode = null, ccode = null;
		int quiz1 = 0, quiz2 = 0, quiz3 = 0, unit1 = 0, unit2 = 0,
				termtest = 0, sumQuiz = 0, sumUnit = 0, age = 0;
		float quizAve = 0, unitAve = 0, termAve = 0, total = 0;
		
		System.out.println("Enter LastName: ");
		lname = sc.nextLine();
		
		System.out.println("Enter FirstName: ");
		fname = sc.nextLine();
		
		do {
			try {
				System.out.println("Enter Age: ");
				age = Integer.parseInt(rd.readLine());
			}
			catch (NumberFormatException a) {
				System.out.println("Warning: "+ a);
			}
		}while(age <= 0);
		
		System.out.println("Enter Address: ");
		addr = sc.nextLine();
		
		System.out.println("Enter Telnum: ");
		telnum = sc.nextLine();
		
		System.out.println("Enter Instructor Name: ");
		tcNM = sc.nextLine();
		
		System.out.println("Enter Teacher Department: ");
		tcDept = sc.nextLine();
		
		System.out.println("Enter Subject Code: ");
		scode = sc.nextLine();
		
		//*do {
			System.out.println("Enter Year Code: ");
			ycode = sc.nextLine();
		//*} while (ycode == "1" || ycode == "2" || ycode == "3");
		
		System.out.println("Enter Course Code: ");
		ccode = sc.nextLine();
		
		do {
			try{
				System.out.print("Enter your score in Quiz1: ");
				quiz1 = Integer.parseInt(rd.readLine());
			}
			catch(NumberFormatException a) {
				System.out.println("Warning: " + a);
			}
		}while(quiz1 <= 0 || quiz1 > 100);
		
		do {
			try{
				System.out.print("Enter your score in Quiz2: ");
				quiz2 = Integer.parseInt(rd.readLine());
			}
			catch(NumberFormatException b) {
				System.out.println("Warning: " + b);
			}
		}while(quiz2 <= 0 || quiz2 > 100);
		
		do {
			try{
				System.out.print("Enter your score in Quiz3: ");
				quiz3 = Integer.parseInt(rd.readLine());
			}
			catch(NumberFormatException c) {
				System.out.println("Warning: " + c);
			}
		}while(quiz3 <= 0 || quiz3 > 100);
		
		do {
			try{
				System.out.print("Enter your score in Unit Test1: ");
				unit1 = Integer.parseInt(rd.readLine());
			}
			catch(NumberFormatException d) {
				System.out.println("Warning: " + d);
			}
		}while(unit1 <= 0 || unit1 > 100);
		
		do {
			try{
				System.out.print("Enter your score in Unit Test2: ");
				unit2 = Integer.parseInt(rd.readLine());
			}
			catch(NumberFormatException e) {
				System.out.println("Warning: " + e);
			}
		}while(unit2 <= 0 || unit2 > 100);
		
		do {
			try{
				System.out.print("Enter your Term Test score: ");
				termtest = Integer.parseInt(rd.readLine());
			}
			catch(NumberFormatException f) {
				System.out.println("Warning: " + f);
			}
		}while(termtest <= 0 || termtest > 100);

		BSIT courseinfo = new BSIT(scode,ycode,ccode);
		
		if (courseinfo.getCcodes() == "BSIT" || courseinfo.getCcodes() == "BSEE" ||
			courseinfo.getCcodes() == "BSME" || courseinfo.getCcodes() == "BSCE") {
		
		GradeClass fingrd = new GradeClass(quiz1,quiz2,quiz3,unit1,unit2,termtest,
				sumQuiz,sumUnit,quizAve,unitAve,termAve,total);
		
		BSIT studInfo = new BSIT(lname,fname,age,addr,telnum,tcNM,tcDept,fingrd);

		System.out.println(studInfo.DisplayStudentInfo());
		System.out.println(courseinfo.DisplayCourseInfo());
		System.out.println(studInfo.toString());
		
		}
	}
}


