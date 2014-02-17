package de.codecentric.sjwa.services;

import java.util.Set;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import de.codecentric.sjwa.model.PersonTO;

@Named
@SessionScoped
public interface PersonService {

	Set<PersonTO> leseAllePersonen();

	PersonTO lesePerson(long id);

	boolean speicherPerson(PersonTO person);
}
