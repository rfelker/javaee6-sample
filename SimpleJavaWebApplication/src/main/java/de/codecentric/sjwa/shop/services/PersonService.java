package de.codecentric.sjwa.shop.services;

import java.io.Serializable;
import java.util.Set;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import de.codecentric.sjwa.shop.model.PersonTO;

@Named
@SessionScoped
public class PersonService implements Serializable {

	private static final long serialVersionUID = 1L;

	public Set<PersonTO> leseAllePersonen() {

		return null;
	}

	public PersonTO lesePerson(long id) {

		return null;
	}

	public boolean speicherPerson(PersonTO person) {

		return true;
	}
}
