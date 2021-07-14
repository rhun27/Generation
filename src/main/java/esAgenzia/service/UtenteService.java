package esAgenzia.service;

import java.util.List;

import esAgenzia.entities.Utente;

public interface UtenteService {
	
	List<Utente> trovaTutti();
	Utente trovaById(int id);
	void aggiungiUtente();
	void aggiungiUtente(String nome, String cognome, String email, int nCarta);

}
