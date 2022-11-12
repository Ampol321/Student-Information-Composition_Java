package superclasstry;

import java.io.IOException;

public class student {
	
	String lname,fname,addr,telnum;
	String scode,ycode,ccode;
	int age;
	
	public student(String lnames, String fnames, int ages, String addrs,
			String telnums) throws NumberFormatException, IOException{
		this.lname = lnames;
		this.fname = fnames;
		this.age = ages;
		this.addr = addrs;
		this.telnum = telnums;
	}
	
	public student(String scodes, String ycodes, String ccodes) {
		this.scode=scodes;
		setYcode(ycodes);
		setCcode(ccodes);
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTelnum() {
		return telnum;
	}

	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}

	public String getScode() {
		return scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public String getYcode() {
		return ycode;
	}

	public void setYcode(String ycodes) {
		this.ycode = (ycodes.equals("1") ? "Freshmen" :
					  ycodes.equals("2") ? "Sophomore" :
					  ycodes.equals("3") ? "Junior" :
					  "Unknown");
	}

	public String getCcode() {
		return ccode;
	}

	public void setCcode(String ccodes) {
		this.ccode = (ccodes.toUpperCase().equals("IT") ? "BSIT" :
					  ccodes.toUpperCase().equals("EE") ? "BSEE" :
					  ccodes.toUpperCase().equals("ME") ? "BSME" :
					  "BSCE");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	String StudentPersonalInfo() {
		return String.format("\nStudent Name: %s\nStudent Age: %02d\nAddress: %s\n"
				+ "Telnum: %s\n",
				getFname() + " " + getLname() , age,addr,telnum);
	}
	
	String CourseInfo() {
		return String.format("\nSubject Code: %s\nStudent Year: %s\nStudent Course: %s",
				scode,getYcode(),getCcode().toUpperCase());
	}
	
}









