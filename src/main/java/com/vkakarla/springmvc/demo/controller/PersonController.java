package com.vkakarla.springmvc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vkakarla.springmvc.demo.model.Person;
import com.vkakarla.springmvc.demo.serviceImpl.PersonService;


@Controller
@RequestMapping("/person-management")
public class PersonController {

	@Autowired
	PersonService personService;

	@RequestMapping(value = "{personId}", method = RequestMethod.GET)
	public @ResponseBody Person getPersonByPersonId(@PathVariable String personId) {

		Person person = null;
		person = personService.getPersonByPersonId(personId);
		return person;

	}

	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public @ResponseBody List<Person> getPersons() {

		List<Person> pList = null;
		pList = personService.getPersons();
		return pList;

	}

}