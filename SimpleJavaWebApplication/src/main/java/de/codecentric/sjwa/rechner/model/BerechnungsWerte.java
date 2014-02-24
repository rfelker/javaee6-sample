package de.codecentric.sjwa.rechner.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * Einfache Bean als Pojo mit zwei Werten. Enthält Annotationen aus
 * "Bean validation" JSR-303. Es handelt sich hier nicht um eine "Named"-Bean,
 * sie kann aber trotzdem in anderen Beans injected werden. Das liegt daran,
 * dass die Bean WerteFabrik als Fabrik für diese Bean zur Verfügung steht.
 */
public class BerechnungsWerte implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	private Long wert1;

	@NotNull
	private Long wert2;

	public Long getWert1() {
		return wert1;
	}

	public void setWert1(Long wert1) {
		this.wert1 = wert1;
	}

	public Long getWert2() {
		return wert2;
	}

	public void setWert2(Long wert2) {
		this.wert2 = wert2;
	}

}
