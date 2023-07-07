package BackEnd_unit01_week02_day05_weekProject_Package;

public class Libro extends Elemento {

	// - - - - - - - - - - - - - - - - - - - - attributes
	protected String autore;
	protected String genere;

	// - - - - - - - - - - - - - - - - - - - - constructors
	public Libro(String _isbn, String _titolo, int _annoPubblicazione, int _numeroPagine) {
		super(_isbn, _titolo, _annoPubblicazione, _numeroPagine);
		// TODO Auto-generated constructor stub
	}

	public Libro(String _isbn, String _titolo, int _annoPubblicazione, int _numeroPagine, String _autore,
			String _genere) {
		super(_isbn, _titolo, _annoPubblicazione, _numeroPagine);
		this.autore = _autore;
		this.genere = _genere;
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

	public String getAutore() {
		return autore;
	}

	public String getGenere() {
		return genere;
	}
}
