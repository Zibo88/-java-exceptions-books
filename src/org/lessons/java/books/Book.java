package org.lessons.java.books;

public class Book {
	
	protected String titolo;
	protected int numeroPagine;
	protected String autore;
	protected String editore;
	
	
	public Book(String titolo, int numeroPagine, String autore, String editore) throws Exception {
		super();
		this.titolo = titolo;
		validateTitolo(titolo);
		this.numeroPagine = numeroPagine;
		validePagine(numeroPagine);
		this.autore = autore;
		validateAutore(autore);
		this.editore = editore;
		validateEditore(editore);
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public void validateTitolo(String titolo) throws Exception {
		if(titolo.length()==0) {
			throw new Exception();
		}
	}


	public int getNumeroPagine() {
		return numeroPagine;
	}


	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	
	public void validePagine(int numeroPagine) throws Exception {
		if(numeroPagine == 0) {
			throw new Exception();
		}
	}


	public String getAutore() {
		return autore;
	}


	public void setAutore(String autore) {
		this.autore = autore;
	}
	public void validateAutore(String autore) throws Exception {
		if(autore.length()==0) {
			throw new Exception();
		}
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}
	
	public void validateEditore(String editore) throws Exception {
		if(autore.length()==0) {
			throw new Exception();
		}
	}


	@Override
	public String toString() {
		return "Book [titolo=" + titolo + ", numeroPagine=" + numeroPagine + ", autore=" + autore + ", editore="
				+ editore + ", getTitolo()=" + getTitolo() + ", getNumeroPagine()=" + getNumeroPagine()
				+ ", getAutore()=" + getAutore() + ", getEditore()=" + getEditore() + "]";
	}
	
	
	
	
}
