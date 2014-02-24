package de.codecentric.sjwa.rechner.operationen;

import javax.inject.Named;

import de.codecentric.sjwa.rechner.model.BerechnungsWerte;

/**
 * Führt eine Multiplikation durch
 */
@Named
public class Multiplikation implements Berechnung {

	private static final String MULTIPLICATION = "%s * %s = %s";

	@Override
	public String ausfuehren(BerechnungsWerte input) {

		return String.format(MULTIPLICATION, input.getWert1(),
				input.getWert2(), input.getWert1() * input.getWert2());
	}

}
