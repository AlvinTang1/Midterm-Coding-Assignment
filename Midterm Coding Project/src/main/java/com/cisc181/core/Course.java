package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {

public UUID getCourseID() {
		return courseID;
	}
	public void setCourseID(UUID courseID) {
		this.courseID = UUID.randomUUID();
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getGradePoints() {
		return gradePoints;
	}
	public void setGradePoints(int gradePoints) {
		this.gradePoints = gradePoints;
	}
	public eMajor getMajor() {
		return Major;
	}
	public void setMajor(eMajor major) {
		Major = major;
	}
public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
private UUID courseID;
private String courseName;
private int gradePoints;
private eMajor Major;
private int creditHours;
Course(){}
public Course(UUID courseID, String courseName, int gradePoints, eMajor Major) {
}
}