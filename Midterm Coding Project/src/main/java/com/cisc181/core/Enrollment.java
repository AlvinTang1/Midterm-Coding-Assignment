package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
public UUID getSectionID() {
		return sectionID;
	}
	public void setSectionID(UUID sectionID) {
		this.sectionID = sectionID;
	}
	public UUID getStudentID() {
		return studentID;
	}
	public void setStudentID(UUID studentID) {
		this.studentID = studentID;
	}
	public UUID getEnrollmentID() {
		return enrollmentID;
	}
	public void setEnrollmentID(UUID enrollmentID) {
		this.enrollmentID = enrollmentID;
	}
	public double getGrade() {
		return grade;}
	public double getGPA(Course course){	
		return course.getGradePoints()/course.getCreditHours();
	}
private UUID sectionID;
private UUID studentID;
private UUID enrollmentID;
private double grade;
private Enrollment(){};
Enrollment(UUID sectionID,UUID studentID){
enrollmentID=UUID.randomUUID();
this.studentID=studentID;
this.sectionID=sectionID;
}
public void setGrade(double grade){
	grade=this.grade;
}
}
