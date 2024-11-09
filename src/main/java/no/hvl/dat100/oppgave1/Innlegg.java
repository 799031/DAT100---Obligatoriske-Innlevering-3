package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;
	
	public Innlegg() {
	}
	
	public Innlegg(int id, String bruker, String dato) {
		setId(id);
		setBruker(bruker);
		setDato(dato);
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		
		setId(id);
		setBruker(bruker);
		setDato(dato);
		this.likes = likes;
	}
	
	// set functions
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	
	// get functions
	public int getId() {
		return this.id;
	}

	public String getBruker() {
		return this.bruker;
	}

	public String getDato() {
		return this.dato;
	}


	public int getLikes() {
		return likes;
	}
	
	
	public void doLike () {
		this.likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		return innlegg.getId() == id;
	}
	
	public String toString() {
		String str = id+"\n"+bruker+"\n"+dato+"\n"+likes+"\n";
		return str;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
