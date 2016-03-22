package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() throws PersonException {
 ArrayList<Course> testCourse = new ArrayList<Course>();
 Course Course1 = new Course();{}
 Course Course2 = new Course();{}
 Course Course3 = new Course();{}
 testCourse.add(Course1);
 testCourse.add(Course2);
 testCourse.add(Course3);
	
ArrayList<Semester> testSemester = new ArrayList<Semester>();
Semester Fall = new Semester();{}
Semester Spring = new Semester();{}
testSemester.add(Fall);
testSemester.add(Spring);

ArrayList<Section> testSection = new ArrayList<Section>();
Section Section1 = new Section(Course1.getCourseID(),Fall.getSemesterID());
Section Section2 = new Section(Course2.getCourseID(),Fall.getSemesterID());
Section Section3 = new Section(Course3.getCourseID(),Fall.getSemesterID());
Section Section4 = new Section(Course1.getCourseID(),Spring.getSemesterID());
Section Section5 = new Section(Course2.getCourseID(),Spring.getSemesterID());
Section Section6 = new Section(Course3.getCourseID(),Spring.getSemesterID());
testSection.add(Section1);
testSection.add(Section2);
testSection.add(Section3);
testSection.add(Section4);
testSection.add(Section5);
testSection.add(Section6);

ArrayList<Student> testStudent = new ArrayList<Student>();
Date date1 = new Date(300,12,30);
Student Student1 = new Student("a","b","c",date1,eMajor.COMPSCI,"abc","302-111-1111","a@gmail.com");
Student Student2 = new Student("d","e","f",date1,eMajor.BUSINESS,"def","302-222-2222","b@gmail.com");
Student Student3 = new Student("ab","bc","cd",date1,eMajor.CHEM,"abc","302-333-3333","c@gmail.com");
Student Student4 = new Student("aad","bbd","ccd",date1,eMajor.NURSING,"abc","302-444-4444","d@gmail.com");
Student Student5 = new Student("aaa","bbb","ccc",date1,eMajor.CHEM,"abc","302-555-5555","e@gmail.com");
Student Student6 = new Student("acc","bdd","cee",date1,eMajor.PHYSICS,"abc","302-666-6666","f@gmail.com");
Student Student7 = new Student("aff","bgg","chh",date1,eMajor.COMPSCI,"abc","302-777-7777","g@gmail.com");
Student Student8 = new Student("aii","bjj","ckk",date1,eMajor.COMPSCI,"abc","302-888-8888","h@gmail.com");
Student Student9 = new Student("all","bmm","cnn",date1,eMajor.COMPSCI,"abc","302-999-9999","i@gmail.com");
Student Student10 = new Student("aoo","bpp","cqq",date1,eMajor.COMPSCI,"abc","302-123-4567","j@gmail.com");
testStudent.add(Student1);
testStudent.add(Student2);
testStudent.add(Student3);
testStudent.add(Student4);
testStudent.add(Student5);
testStudent.add(Student6);
testStudent.add(Student7);
testStudent.add(Student8);
testStudent.add(Student9);
testStudent.add(Student10);
}

	@SuppressWarnings("deprecation")
	@Test
	public void testChangingMajor() throws PersonException {
		assertEquals(1, 1);
		Date date1 = new Date(300,12,30);
Student Student1 = new Student("a","b","c",date1,eMajor.BUSINESS,"abc","302-111-1111","a@gmail.com");}
	@Test 
	public void testAddingStudent(){
	Section Section1.add(Student1);
	Section Section2.add(Student2);
	Section Section3.add(Student3);
	Section Section4.add(Student4);
	Section Section5.add(Student5);
	Section Section6.add(Student6);
	Section Section1.add(Student7);
	Section Section2.add(Student8);
	Section Section3.add(Student9);
	Section Section4.add(Student10);
	
	
	}
	@Test
	public void testGPA(){
	double expectedValue = 3.8;
	double actualValue = getGPA(course1);
	assertEquals("testGPA has failed",(double)expectedValue,(double)actualValue);
	
/*	@Test
	public void testGPA2(){
	double expectedValue = 2.8;
	double actualValue = getGPA2(course2);
	assertEquals("testGPA has failed",(double)expectedValue,(double)actualValue);
	
	@Test
	public void testGPA3(){
	double expectedValue = 4.0;
	double actualValue = getGPA(course3);
	assertEquals("testGPA has failed",(double)expectedValue,(double)actualValue);
	
	@Test
	public void testGPA4(){
	double expectedValue = 2.6;
	double actualValue = getGPA(course5);
	assertEquals("testGPA has failed",(double)expectedValue,(double)actualValue);
	@Test
	public void testGPA5(){
	double expectedValue = 3.0;
	double actualValue = getGPA(course6);
	assertEquals("testGPA has failed",(double)expectedValue,(double)actualValue); */
	}
	}
	