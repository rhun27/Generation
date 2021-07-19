package agViaggi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prenotazioni")
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int utente_id, viaggio_id;
	private double prezzo_totale;

	public Prenotazione() {}

	public Prenotazione(int utente_id, int viaggio_id, double prezzo_totale) {
		this.utente_id = utente_id;
		this.viaggio_id = viaggio_id;
		this.prezzo_totale = prezzo_totale;
	}

	@Override
	public String toString() {
		return "Prenotazione [id=" + id + ", utente_id=" + utente_id + ", viaggio_id=" + viaggio_id + ", prezzo_totale="
				+ prezzo_totale + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUtente_id() {
		return utente_id;
	}

	public void setUtente_id(int utente_id) {
		this.utente_id = utente_id;
	}

	public int getViaggio_id() {
		return viaggio_id;
	}

	public void setViaggio_id(int viaggio_id) {
		this.viaggio_id = viaggio_id;
	}

	public double getPrezzo_totale() {
		return prezzo_totale;
	}

	public void setPrezzo_totale(double prezzo_totale) {
		this.prezzo_totale = prezzo_totale;
	}

}
