package agViaggi.service;

import java.util.List;

import agViaggi.entities.Utente;

public interface UtenteService {
	
	List<Utente> trovaTutti();
	Utente trovaById(int id);
	void aggiungiUtente(Utente u);

}
