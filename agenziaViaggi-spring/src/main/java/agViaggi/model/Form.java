package agViaggi.model;

public class Form {

	private String nome;
	private String cognome;
	private String email;
	private String nCarta;
	private int passeggeri;
	private int idViaggio;

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

	public String getnCarta() {
		return nCarta;
	}

	public void setnCarta(String nCarta) {
		this.nCarta = nCarta;
	}

	public int getPasseggeri() {
		return passeggeri;
	}

	public void setPasseggeri(int passeggeri) {
		this.passeggeri = passeggeri;
	}

	public int getIdViaggio() {
		return idViaggio;
	}

	public void setIdViaggio(int idViaggio) {
		this.idViaggio = idViaggio;
	}

}