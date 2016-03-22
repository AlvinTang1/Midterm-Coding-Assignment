package com.cisc181.core;

import java.util.UUID;
import java.util.Date;
public class Semester {
private UUID semesterID;
private Date startDate;
private Date endDate;
public UUID getSemesterID() {
	return semesterID;
}
public void setSemesterID(UUID semesterID) {
	this.semesterID = semesterID;
}
public Date getStartDate() {
	return startDate;
}
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
public Date getEndDate() {
	return endDate;
}
public void setEndDate(Date endDate) {
	this.endDate = endDate;
}
Semester(){}
}