package de.codecentric.sjwa.shop.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUKT")
public class Produkt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "BESCHREIBUNG")
	private String beschreibung;

	@Column(name = "PREIS", nullable = false, precision = 17, scale = 17)
	private double preis;
}
