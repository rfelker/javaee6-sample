package de.codecentric.sjwa.shop.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "NACHNAME")
	private String nachname;

	@Column(name = "VORNAME")
	private String vorname;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Warenkorb> warenkoerbe = new HashSet<>(0);
}
