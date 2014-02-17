package de.codecentric.sjwa.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import de.codecentric.sjwa.model.ProduktTO;

@Named
@SessionScoped
public class ProduktService implements Serializable {

	private static final long serialVersionUID = 1L;

	public Set<ProduktTO> getAlleProdukte() {

		Set<ProduktTO> produkte = new HashSet<>();

		produkte.add(erzeugeProdukt(1, "Playstation 3", 250));
		produkte.add(erzeugeProdukt(2, "LCD Fernseher", 455));
		produkte.add(erzeugeProdukt(3, "Eizo Monitor", 350));
		produkte.add(erzeugeProdukt(4, "Tastatur", 25));

		return produkte;
	}

	public List<ProduktTO> getAlleProdukteList() {
		List<ProduktTO> liste = new ArrayList<>();
		liste.addAll(getAlleProdukte());
		Collections.sort(liste);
		return liste;
	}

	public String getAlleProdukteString() {
		return "alle Produkte";
	}

	public boolean speicherProdukt(ProduktTO produkt) {
		return true;
	}

	private ProduktTO erzeugeProdukt(long id, String name, double preis) {
		ProduktTO produkt = new ProduktTO();
		produkt.setId(id);
		produkt.setName(name);
		produkt.setPreis(preis);
		return produkt;
	}
}
