package de.codecentric.sjwa.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class ProduktTO implements Comparable<ProduktTO>, Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	private String name;

	private String beschreibung;

	@NotNull
	private double preis;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	@Override
	public int compareTo(ProduktTO other) {
		return this.getName().compareTo(other.name);
	}
}
