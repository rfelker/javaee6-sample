package de.codecentric.sjwa.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class PersonTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;

	@NotNull
	private String nachname;

	@NotNull
	private String vorname;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

}
