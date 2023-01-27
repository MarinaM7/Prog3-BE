package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("Libro")
@Getter
@Setter
@NoArgsConstructor
public class Libri extends Catalogo {
	
	private String autore;
	private String genere;

	public Libri(long cod, String titolo, int date, int num, String autore, String genere) {
		super(cod, titolo, date, num);
		this.autore = autore;
		this.genere = genere;
	}
	
	@Override
	public String toString() {
		return "Titolo libro: " + getTitolo() + " || Autore: " + getAutore() + " || Genere: " + getGenere() + " || Data pubblicazione: " + getDate();
	}
	

}
