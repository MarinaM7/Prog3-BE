package entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "prestiti")
@Getter
@Setter
@NoArgsConstructor
public class Prestito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "utente_id", referencedColumnName = "id")
	private Utente utente;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "elemento_prestato", referencedColumnName = "id")
	private Catalogo elemento;
	
	@Column(name = "data_prestito")
	private LocalDate data;
	
	@Column(name = "restituzione_prevista")
	private LocalDate restituzionePrevista;
	
	@Column(name = "restituzione_effettiva")
	private LocalDate restituzioneEffettiva;

	public Prestito(Utente utente, Catalogo elemento, LocalDate data, LocalDate restituzioneEffettiva) {
		this.utente = utente;
		this.elemento = elemento;
		this.data = data;
		this.restituzionePrevista = data.plusMonths(1);
		this.restituzioneEffettiva = restituzioneEffettiva;
	}
	
}
