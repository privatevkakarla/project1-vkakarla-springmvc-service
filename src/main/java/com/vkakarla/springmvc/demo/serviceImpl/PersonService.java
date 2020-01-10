package com.vkakarla.springmvc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vkakarla.springmvc.demo.DaoImpl.PersonDao;
import com.vkakarla.springmvc.demo.model.Person;
import com.vkakarla.springmvc.demo.service.IPersonService;

@Service
public class PersonService implements IPersonService {

	@Autowired
	PersonDao personDao;

	@Override
	public Person getPersonByPersonId(String personId) {

		Person person = null;
		person = personDao.getPersonByPersonId(personId);
		return person;
	}

	@Override
	public List<Person> getPersons() {

		List<Person> pList = null;
		pList = personDao.getPersons();

		return pList;
	}

}
