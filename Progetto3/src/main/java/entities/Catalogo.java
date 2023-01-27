package entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "catalogo")
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "element_type", discriminatorType = DiscriminatorType.STRING)
public class Catalogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private long code;
	
	private String titolo;
	
	private int date;
	
	private int num;
	
	@OneToOne(mappedBy = "elemento")
	private Prestito prestito;
	
	public Catalogo(long code, String titolo, int date, int num) {
		this.code = code;
		this.titolo = titolo;
		this.date = date;
		this.num = num;
	}

}
