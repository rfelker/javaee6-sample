package de.codecentric.sjwa.rechner.operationen;

import javax.inject.Named;

import de.codecentric.sjwa.rechner.model.BerechnungsWerte;

/**
 * Führt eine Division durch
 */
@Named
public class Division implements Berechnung {

	private static final String DIVISION = "%s / %s = %s";

	@Override
	public String ausfuehren(BerechnungsWerte input) {

		return String.format(DIVISION, input.getWert1(), input.getWert2(),
				input.getWert1() / input.getWert2());
	}

}
