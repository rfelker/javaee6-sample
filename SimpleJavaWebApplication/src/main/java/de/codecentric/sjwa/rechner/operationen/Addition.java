package de.codecentric.sjwa.rechner.operationen;

import javax.inject.Named;

import de.codecentric.sjwa.rechner.model.BerechnungsWerte;

/**
 * Führt eine Addition durch
 */
@Named
public class Addition implements Berechnung {

	private static final String ADDITION = "%s + %s = %s";

	@Override
	public String ausfuehren(BerechnungsWerte input) {

		return String.format(ADDITION, input.getWert1(), input.getWert2(),
				input.getWert1() + input.getWert2());
	}

}
