package com.vkakarla.springmvc.demo.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vkakarla.springmvc.demo.Dao.IPersonDao;
import com.vkakarla.springmvc.demo.model.Person;

@Repository
public class PersonDao implements IPersonDao {

	@Override
	public Person getPersonByPersonId(String personId) {
		Person person = new Person();
		person.setPersonId(personId);
		person.setFirstName("veera");
		person.setLastName("Kakarla");
		person.setCountry("India");
		return person;
	}

	@Override
	public List<Person> getPersons() {
        List<Person> pList = new ArrayList<Person>();
		
		Person person1 = new Person();
		person1.setPersonId("54321");
		person1.setFirstName("veera");
		person1.setLastName("Kakarla");
		person1.setCountry("India");

		Person person = new Person();
		person.setPersonId("12345");
		person.setFirstName("Subbu");
		person.setLastName("Subramanyam");
		person.setCountry("America");
		
		pList.add(person);
		pList.add(person1);
		
		return pList;
	}

}
