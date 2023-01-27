package app;

import entities.Period;

public class Main {

	public static void main(String[] args) {
	
		
		MainDAO e = new MainDAO();
		
//		e.insertUtente("Marina", "Muntenita", 2002, 6, 13, 0013);
//		e.insertUtente("Anna", "Bianchi", 2003, 9, 23, 0012);
//		e.insertUtente("Giacomo", "Neri", 1999, 3, 5, 0011);
//		
//		e.insertLibro(11223340, "Lo straniero", 1942, 200, "Albert Camus", "romanzo");
//		e.insertLibro(11223341, "Il processo", 1925, 289, "Franz Kafka", "romanzo");
//		e.insertLibro(11223342, "1984", 1949, 212, "George Orwell", "romanzo");
//		e.insertLibro(11223343, "Ulisse", 1922, 198, "James Joice", "romanzo");
//		e.insertLibro(11223344, "Il nome della rosa", 1980, 390, "Umberto Eco", "romanzo");
//		
//		e.insertRivista(22288890, "Mag44", 2020, 20, Period.MENSILE);
//		e.insertRivista(22288891, "Sun and Moon", 2022, 43, Period.SEMESTRALE);
//		e.insertRivista(22288892, "Focus", 2009, 35, Period.MENSILE);
//		e.insertRivista(22288893, "Explore and Discover", 2018, 22, Period.SETTIMANALE);
//		
//		e.insertPrestito(1, 4, 2023, 3, 12);
//		e.insertPrestito(2, 3, 2023, 2, 19);
//		e.insertPrestito(3, 1, 2023, 4, 1);
//		e.insertPrestito(1, 2, 2023, 2, 28);
//		e.insertPrestito(2, 5, 2023, 6, 6);
//		e.insertPrestito(2, 6, 2023, 3, 14);
//		e.insertPrestito(3, 7, 2024, 2, 10);
//		e.insertPrestito(1, 8, 2023, 3, 23);
//		e.insertPrestito(2, 9, 2023, 4, 4);
		
		e.getElementoPerISBN(22288892);
		e.getElementoPerISBN(22288897);
		
		e.getElementoPerAnno(2022);
		e.getElementoPerAnno(2000);
		
		e.getElementoPerAutore("Albert");
		
		e.getElementoPerTitolo("nome");
		e.getElementoPerTitolo("ciao");
		
		e.close();

	}

}
