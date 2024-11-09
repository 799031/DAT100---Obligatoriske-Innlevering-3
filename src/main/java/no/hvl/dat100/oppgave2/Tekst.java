package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

	protected String tekst;

	public Tekst() {
	}

	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id, bruker, dato);
		setTekst(tekst);
	}

	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id, bruker, dato, likes);
		setTekst(tekst);
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public String getTekst() {
		return this.tekst;
	}
	
	protected String toStringInnlegg(){
		return super.toString();
	}
	
	@Override
	public String toString() {
		String str = "TEKST\n" + super.toString() + tekst + "\n";
		return str;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		throw new UnsupportedOperationException(TODO.method());

	}
}
