package de.codecentric.sjwa.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "WARENKORB")
public class Warenkorb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Position> positionen = new HashSet<>(0);
}
