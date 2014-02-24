package de.codecentric.sjwa.rechner.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Named;

import de.codecentric.sjwa.rechner.model.BerechnungsWerte;
import de.codecentric.sjwa.rechner.model.KleineWerte;
import de.codecentric.sjwa.rechner.operationen.Addition;
import de.codecentric.sjwa.rechner.operationen.Berechnung;

/**
 * Der Service wird direkt vom JSF2 Kontext aus zugegriffen.
 */
@Named
@SessionScoped
public class BerechnungService implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Enthällt alle Berechnungsergebnisse. Wird aus JSF zugegriffen zum
	 * Anzeigen der Ergebnisse
	 */
	private List<String> output;

	@Inject
	private transient Addition addition;

	/**
	 * Instance bedeutet, dass alle mittels CDI registrierte Berechnung-Beans
	 * hinzugefügt werden sollen
	 */
	@Inject
	private transient Instance<Berechnung> operationen;

	/**
	 * BerechnungsWerte ist keine "Named" Bean. Dank der Fabrik WerteFabrik ist
	 * eine Zuordnung dank der Qualifizierer trotzdem möglich
	 * 
	 * @GrosseWerte gibt an, welche Fabrik-Methode zuständig ist
	 */
	@Inject
	@KleineWerte
	private BerechnungsWerte werte;

	/**
	 * Form action
	 * 
	 * @return Einfache JSF2 Navigation
	 */
	public String addiere() {
		output.clear();
		output.add(addition.ausfuehren(werte));
		return "rechner";
	}

	/**
	 * JSF form action. Gibt alle Berechnungen aus, die via CDI
	 * "Plugin"-Mechanismus hinzugefügt wurden
	 * 
	 * @return Einfache JSF2 Navigation
	 */
	public String alleAusfuehren() {
		output.clear();
		for (Berechnung operation : operationen) {
			output.add(operation.ausfuehren(werte));
		}
		return "rechner";
	}

	@PostConstruct
	private void init() {
		this.output = new ArrayList<String>();
	}

	public BerechnungsWerte getWerte() {
		return werte;
	}

	public List<String> getOutput() {
		Collections.sort(output);
		return output;
	}

}
