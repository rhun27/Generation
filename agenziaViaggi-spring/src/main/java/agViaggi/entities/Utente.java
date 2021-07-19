package agViaggi.entities;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "utente")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome, cognome, email;
	//@Column(name="numero_carta")
	private BigInteger numeroCarta;

	public Utente() {}

	public Utente( String nome, String cognome, String email, BigInteger numeroCarta) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.numeroCarta = numeroCarta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigInteger getNumeroCarta() {
		return numeroCarta;
	}

	public void setNumeroCarta(BigInteger numeroCarta) {
		this.numeroCarta = numeroCarta;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", numeroCarta="
				+ numeroCarta + "]";
	}

}