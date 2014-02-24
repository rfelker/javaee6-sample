package de.codecentric.sjwa.rechner.operationen;

import javax.inject.Named;

import de.codecentric.sjwa.rechner.model.BerechnungsWerte;

/**
 * Führt eine Subtraktion durch
 */
@Named
public class Substraktion implements Berechnung {

	private static final String SUBTRACTION = "%s - %s = %s";

	@Override
	public String ausfuehren(BerechnungsWerte input) {

		return String.format(SUBTRACTION, input.getWert1(), input.getWert2(),
				input.getWert1() - input.getWert2());
	}
}
