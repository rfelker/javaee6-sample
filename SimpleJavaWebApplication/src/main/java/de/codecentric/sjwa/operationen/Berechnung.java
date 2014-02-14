package de.codecentric.sjwa.operationen;

import de.codecentric.sjwa.model.BerechnungsWerte;

/**
 * Beschreibt eine Berechnung, welche ausgeführt werden kann. Als Resultat
 * erhält man die Berechnung und das Ergebnis als String
 */
public interface Berechnung {

	public String ausfuehren(BerechnungsWerte input);
}
