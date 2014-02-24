package de.codecentric.sjwa.shop.services;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import de.codecentric.sjwa.shop.model.PersonTO;
import de.codecentric.sjwa.shop.model.WarenkorbTO;

@Named
@SessionScoped
public class WarenkorbService implements Serializable {

	private static final long serialVersionUID = 1L;

	public WarenkorbTO leseWarenkorb(PersonTO person) {
		return null;
	}

	public boolean speichern(PersonTO person, WarenkorbTO warenkorb) {
		return true;
	}

	public void loeschen() {

	}

}
