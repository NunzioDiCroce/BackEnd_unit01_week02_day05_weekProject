package BackEnd_unit01_week02_day05_weekProject_Package;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	// - - - - - - - - - - - - - - - - - - - - ArrayList "archivio" definition
	public static List<Elemento> archivio = new ArrayList<>();

	// - - - - - - - - - - - - - - - - - - - - main method definition
	public static void main(String[] args) {

		// - - - - - - - - - - - - - - - - - - - - sample objects creation

		// public Elemento(String _isbn, String _titolo, int _anno, int _pagine)

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

		// - - - - - - - - - - - - - - - - - - - - console
		System.out.println("");
		System.out.println("CATALOGO BIBLIOGRAFICO");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");

		System.out.println("");
		System.out.println("Elenco degli elementi aggiunti:");
		aggiungiElemento(libro01);
		aggiungiElemento(libro02);
		aggiungiElemento(libro03);
		aggiungiElemento(libro04);
		aggiungiElemento(libro05);
		aggiungiElemento(rivista01);
		aggiungiElemento(rivista02);
		aggiungiElemento(rivista03);
		aggiungiElemento(rivista04);
		aggiungiElemento(rivista05);
		for (Elemento _elemento : archivio) {
			System.out.println(_elemento);
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - -");

		rimuoviElementoPerIsbn("001");
		System.out.println("");
		System.out.println("Elenco degli elementi dopo rimozione di ISBN 001:");
		for (Elemento _elemento : archivio) {
			System.out.println(_elemento);
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - -");

		ricercaElementoPerIsbn("002");
		System.out.println("");
		System.out.println("Ricerca elemento con ISBN 002:");
		System.out.println(ricercaElementoPerIsbn("002"));
		System.out.println("- - - - - - - - - - - - - - - - - - - -");

		List<Elemento> archivioPerAnno = ricercaElementoPerAnno(2020);
		System.out.println("");
		System.out.println("Ricerca elementi del 2020:");
		for (Elemento _elemento : archivioPerAnno) {
			System.out.println(_elemento);
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - -");

		List<Elemento> archivioPerAutore = ricercaElementoPerAutore("Paolo");
		System.out.println("");
		System.out.println("Ricerca elementi con autore Paolo:");
		for (Elemento _elemento : archivioPerAutore) {
			System.out.println(_elemento);
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - -");

		System.out.println("");
		System.out.println("Salvataggio su file degli elementi presenti in archivio");
		salvaArchivioSuFile("info.txt");
		System.out.println("Guardare info.txt per verificare il salvataggio");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");

//		List<Libro> archivioDue = leggiArchivioDaFile("info2.txt");
//		System.out.println("");
//		System.out.println("Creazione nuovo archivio con elementi presenti su file");
//		System.out.println("Elenco degli elementi inseriti nel nuovo archivio. Guardare info2.txt per verifica");
//		for (Elemento _elemento : archivioDue) {
//			System.out.println(_elemento);
//		}
//		System.out.println("- - - - - - - - - - - - - - - - - - - -");
	}

	// - - - - - - - - - - - - - - - - - - - - methods definition
	public static void aggiungiElemento(Elemento _elemento) {
		archivio.add(_elemento);
	}

	public static void rimuoviElementoPerIsbn(String _isbn) {
		archivio.removeIf(_elemento -> _elemento.getIsbn().equals(_isbn));
	}

	public static Elemento ricercaElementoPerIsbn(String _isbn) {
		return archivio.stream().filter(_elemento -> _elemento.getIsbn().equals(_isbn)).findFirst().orElse(null);
	}

	public static ArrayList<Elemento> ricercaElementoPerAnno(int _anno) {
		return archivio.stream().filter(_elemento -> _elemento.getAnno() == _anno)
				.collect(Collectors.toCollection(ArrayList::new));
	}

	public static ArrayList<Elemento> ricercaElementoPerAutore(String _autore) {
		return archivio.stream()
				.filter(_elemento -> _elemento instanceof Libro && ((Libro) _elemento).getAutore().equals(_autore))
				.collect(Collectors.toCollection(ArrayList::new));
	}

	// public Libro(String _isbn, String _titolo, int _anno, int _pagine, String
	// _autore, String _genere)

	// public Rivista(String _isbn, String _titolo, int _anno, int _pagine,
	// Periodicita _periodicita)

	public static void salvaArchivioSuFile(String _nomeFile) {
		try (FileWriter scriviSuFile = new FileWriter(_nomeFile)) {
			for (Elemento _elemento : archivio) {
				if (_elemento instanceof Libro) {
					Libro libro = (Libro) _elemento;
					scriviSuFile.write(libro.getIsbn() + "," + libro.getTitolo() + "," + libro.getAnno() + ","
							+ libro.getPagine() + "," + libro.getAutore() + "," + libro.getGenere() + "\n");
				} else if (_elemento instanceof Rivista) {
					Rivista rivista = (Rivista) _elemento;
					scriviSuFile.write(rivista.getIsbn() + "," + rivista.getTitolo() + "," + rivista.getAnno() + ","
							+ rivista.getPagine() + "," + rivista.getPeriodicita() + "\n");
				}
			}
		} catch (IOException _e) {
			_e.printStackTrace();
		}
	}

	public static ArrayList<Elemento> creaArchivioDaFile(String _nomeFile) {

		// - - - - - - - - - - - - - - - - - - - - ArrayList "archivioDue" definition
		ArrayList<Elemento> archivioDue = new ArrayList<>();

		try (BufferedReader leggiDaFile = new BufferedReader(new FileReader(_nomeFile))) {

			String riga;

			while ((riga = leggiDaFile.readLine()) != null) {

				// public Elemento(String _isbn, String _titolo, int _anno, int _pagine)
				String[] attributi = riga.split(",");
				String isbn = attributi[0];
				String titolo = attributi[1];
				int anno = Integer.parseInt(attributi[2]);
				int pagine = Integer.parseInt(attributi[3]);

				if (attributi.length == 6) {
					// public Libro(String _isbn, String _titolo, int _anno, int _pagine, String
					// _autore, String _genere)
					String autore = attributi[4];
					String genere = attributi[5];

				} else if (attributi.length == 5) {
					// public Rivista(String _isbn, String _titolo, int _anno, int _pagine,
					// Periodicita _periodicita)
				}

			}

		} catch (IOException _e) {
			_e.printStackTrace();
		}

		return archivioDue;

	}
}
