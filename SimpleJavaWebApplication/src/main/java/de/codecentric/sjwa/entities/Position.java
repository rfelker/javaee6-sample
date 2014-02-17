package de.codecentric.sjwa.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "WK_POSITION")
public class Position implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUKT_ID", nullable = false)
	private Produkt produkt;
}
