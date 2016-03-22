package com.cisc181.core;

import java.util.Calendar;

public class PersonException extends Exception {
private Person person;
public PersonException(Person person){
	super();
	this.person=person;
}
public Person getPerson()
{
	return person;
}
Calendar today = Calendar.getInstance();
Calendar birthDate = Calendar.getInstance();
int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
;{
if (age > today.get(Calendar.YEAR) + 100) {
	throw new PersonException(person);
} else
	this.DOB = DOB;
}
}
