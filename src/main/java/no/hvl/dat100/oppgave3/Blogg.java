package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg innlegg[];
	private int antall;
	
	public Blogg() {
		innlegg = new Innlegg[20];
		this.antall = 0;
	}

	public Blogg(int lengde) {
		innlegg = new Innlegg[lengde];
		this.antall = 0;
	}

	public int getAntall() {
		return this.antall;
	}
	
	public Innlegg[] getSamling() {
		return this.innlegg;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i=0; i<antall; i++)
			if(this.innlegg[i].erLik(innlegg))
				return i;
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		return innlegg.length != antall;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		if(!ledigPlass())
			return false;
		
		this.innlegg[antall] = innlegg;
		antall++;
		return true;
	}
	
	public String toString() {
		String str = String.valueOf(getAntall()) + "\n";

		for(int i = 0; i<antall; i++)
			str += innlegg[i].toString();
		return str;
	}

	
	
	
	
	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg temp[] = new Innlegg[innlegg.length];
		
		for(int i = 0; i<this.antall; i++)
			temp[i] = innlegg[i];
		
		innlegg = new Innlegg[innlegg.length*2];
		for(int i = 0; i<this.antall; i++)
			innlegg[i] = temp[i];
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		int index = finnInnlegg(innlegg);
		if(index == -1)
			return false;
		
		this.antall--;
		for(int i = index; i<this.antall; i++)
			this.innlegg[i] = this.innlegg[i+1];
		
		return true;
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}



