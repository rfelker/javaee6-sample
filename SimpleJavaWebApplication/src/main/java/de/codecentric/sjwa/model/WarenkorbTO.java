package de.codecentric.sjwa.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WarenkorbTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Map<ProduktTO, Integer> produkte = new HashMap<>();

	public void fuegeProduktHinzu(ProduktTO produkt, int menge) {
		entferneProdukt(produkt);
		produkte.put(produkt, menge);
	}

	public void entferneProdukt(ProduktTO produkt) {
		produkte.remove(produkt);
	}

	public List<ProduktTO> alleProdukteSortiert() {

		List<ProduktTO> produkteSortiert = new ArrayList<>();
		produkteSortiert.addAll(produkte.keySet());
		Collections.sort(produkteSortiert);
		return produkteSortiert;
	}

	public int getMenge(ProduktTO produkt) {
		return produkte.get(produkt);
	}
}
