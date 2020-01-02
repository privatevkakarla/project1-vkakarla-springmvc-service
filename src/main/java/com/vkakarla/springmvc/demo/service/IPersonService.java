package com.vkakarla.springmvc.demo.service;

import java.util.List;

import com.vkakarla.springmvc.demo.model.Person;

public interface IPersonService {
	
	public Person getPersonByPersonId(String personId);
	
	public List<Person> getPersons();

}
