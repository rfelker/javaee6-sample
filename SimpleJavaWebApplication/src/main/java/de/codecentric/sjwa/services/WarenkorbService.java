package de.codecentric.sjwa.services;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import de.codecentric.sjwa.model.PersonTO;
import de.codecentric.sjwa.model.WarenkorbTO;

@Named
@SessionScoped
public interface WarenkorbService {

	WarenkorbTO leseWarenkorb(PersonTO person);

	boolean speicherWarenkorb(PersonTO person, WarenkorbTO warenkorb);

}
