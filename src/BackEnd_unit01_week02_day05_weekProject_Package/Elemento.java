package BackEnd_unit01_week02_day05_weekProject_Package;

public abstract class Elemento {

	// - - - - - - - - - - - - - - - - - - - - attributes
	protected String isbn;
	protected String titolo;
	protected int annoPubblicazione;
	protected int numeroPagine;

	// - - - - - - - - - - - - - - - - - - - - constructors
	public Elemento(String _isbn, String _titolo, int _annoPubblicazione, int _numeroPagine) {
		this.isbn = _isbn;
		this.titolo = _titolo;
		this.annoPubblicazione = _annoPubblicazione;
		this.numeroPagine = _numeroPagine;
	}

	// - - - - - - - - - - - - - - - - - - - - getters & setters
	public String getIsbn() {
		return isbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

}
