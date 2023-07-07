package BackEnd_unit01_week02_day05_weekProject_Package;

public class Rivista extends Elemento {

	// - - - - - - - - - - - - - - - - - - - - attributes
	protected Periodicita periodicita;

	// - - - - - - - - - - - - - - - - - - - - constructors
	public Rivista(String _isbn, String _titolo, int _annoPubblicazione, int _numeroPagine) {
		super(_isbn, _titolo, _annoPubblicazione, _numeroPagine);
		// TODO Auto-generated constructor stub
	}

	public Rivista(String _isbn, String _titolo, int _annoPubblicazione, int _numeroPagine, Periodicita _periodicita) {
		super(_isbn, _titolo, _annoPubblicazione, _numeroPagine);
		this.periodicita = _periodicita;
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

	public Periodicita getPeriodicita() {
		return periodicita;
	}

}
