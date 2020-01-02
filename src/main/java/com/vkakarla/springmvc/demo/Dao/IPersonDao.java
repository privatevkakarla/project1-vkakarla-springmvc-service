package com.vkakarla.springmvc.demo.Dao;

import java.util.List;

import com.vkakarla.springmvc.demo.model.Person;

public interface IPersonDao {

public Person getPersonByPersonId(String personId);
	
	public List<Person> getPersons();
}
