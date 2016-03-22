package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}

	@Test
public void testStaff() throws PersonException{ 
	ArrayList<Staff> testStaff = new ArrayList<Staff>();
	Staff Staff1 = new Staff("a","b","c",null,"abc","302-222-2222","a@gmail.com",null,0,30000,null,null);
	Staff Staff2 = new Staff("d","e","f",null,"def","302-333-3333","b@gmail.com",null,0,40000,null,null);
	Staff Staff3 = new Staff("g","h","i",null,"ghi","302-444-4444","c@gmail.com",null,0,50000,null,null);
	Staff Staff4 = new Staff("j","k","l",null,"jkl","302-555-5555","d@gmail.com",null,0,60000,null,null);
	Staff Staff5 = new Staff("m","n","o",null,"mno","302-666-6666","e@gmail.com",null,0,70000,null,null);
	testStaff.add(Staff1);
	testStaff.add(Staff2);
	testStaff.add(Staff3);
	testStaff.add(Staff4);
	testStaff.add(Staff5);}
	
  void  assertEquals(long i, long j) {
double current=0;
for(Staff f: testStaff){
 double total =	f.getSalary()+ current;
 }
double average= total/5;
 double bActualResult = 50000;}

@Test(expected=PersonException.class)
public void testDateException() throws PersonException{
Date date1 = new Date(300,12,30);
Staff Staff6 = new Staff("org","orc","oug",date1,"wooo","302-777-7777","f@gmail.com",null,0,80000,null,null);
}
@Test(expected=PersonException.class)
public void testPhoneNumberException() throws PersonException{
Staff Staff7 = new Staff("Woops","woops","WOOPS",null,"woopp","302-1234-1234","n@gmail.com",null,0,90000,null,null);}

}