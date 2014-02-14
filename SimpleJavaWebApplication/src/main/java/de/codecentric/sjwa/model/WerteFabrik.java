package de.codecentric.sjwa.model;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 * Fabrik zum Erzeugen von Berechnugswerten. Über die projektspezifischen
 * Qualifizierer kann bestimmt werden, welche Fabrikmethode aufgerufen werden
 * soll.
 */
@Named
public class WerteFabrik {

	@Produces
	@GrosseWerte
	public BerechnungsWerte initialisiereGrosseWerte() {

		final BerechnungsWerte input = new BerechnungsWerte();
		input.setWert1(1024L);
		input.setWert2(256L);
		return input;
	}

	@Produces
	@KleineWerte
	public BerechnungsWerte initialisiereKleineWerte() {

		final BerechnungsWerte input = new BerechnungsWerte();
		input.setWert1(32L);
		input.setWert2(8L);
		return input;
	}
}
