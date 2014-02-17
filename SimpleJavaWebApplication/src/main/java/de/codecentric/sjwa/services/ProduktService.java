package de.codecentric.sjwa.services;

import java.util.Set;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import de.codecentric.sjwa.model.ProduktTO;

@Named
@SessionScoped
public interface ProduktService {

	Set<ProduktTO> leseAlleProdukte();

	boolean speicherProdukt(ProduktTO produkt);
}
