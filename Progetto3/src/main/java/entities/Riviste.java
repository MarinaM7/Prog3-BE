package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("Rivista")
@Getter
@Setter
@NoArgsConstructor
public class Riviste extends Catalogo {

	@Enumerated(EnumType.STRING)
	private Period period;
	
	public Riviste(long code, String titolo, int date, int num, Period period) {
		super(code, titolo, date, num);
		this.period = period;
	}

	@Override
	public String toString() {
		return "Titolo rivista: " + getTitolo() + " || Periodicità: " + getPeriod() + " || Data pubblicazione: " + getDate();
	}
	
}
