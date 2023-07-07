package BackEnd_unit01_week02_day05_weekProject_Package;

import java.util.ArrayList;
import java.util.List;

public class Main {

	// - - - - - - - - - - - - - - - - - - - - ArrayList "archivio" definition
	public static List<Elemento> archivio = new ArrayList<>();

	// - - - - - - - - - - - - - - - - - - - - main method definition
	public static void main(String[] args) {

		// - - - - - - - - - - - - - - - - - - - - sample objects creation
		// public Libro(String _isbn, String _titolo, int _anno, int _pagine, String
		// _autore, String _genere)
		Libro libro01 = new Libro("001", "Titolo primo libro", 2010, 200, "Mario", "Avventura");
		Libro libro02 = new Libro("002", "Titolo secondo libro", 2015, 200, "Mario", "Fantascienza");
		Libro libro03 = new Libro("003", "Titolo terzo libro", 2010, 180, "Paolo", "Avventura");
		Libro libro04 = new Libro("004", "Titolo quarto libro", 2015, 180, "Paolo", "Fantascienza");
		Libro libro05 = new Libro("005", "Titolo quinto libro", 2020, 180, "Paolo", "Giallo");
		// public Rivista(String _isbn, String _titolo, int _anno, int _pagine,
		// Periodicita _periodicita)
		Rivista rivista01 = new Rivista("011", "Titolo prima rivista", 2010, 100, Periodicita.SEMESTRALE);
		Rivista rivista02 = new Rivista("011", "Titolo seconda rivista", 2010, 100, Periodicita.SEMESTRALE);
		Rivista rivista03 = new Rivista("013", "Titolo terza rivista", 2010, 50, Periodicita.MENSILE);
		Rivista rivista04 = new Rivista("014", "Titolo quarta rivista", 2015, 50, Periodicita.MENSILE);
		Rivista rivista05 = new Rivista("015", "Titolo quinta rivista", 2020, 25, Periodicita.SETTIMANALE);

	}

}
