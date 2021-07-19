package agViaggi.service;

import java.util.List;

import agViaggi.entities.Prenotazione;

public interface PrenotazioneService {
	
	List<Prenotazione> trovatutte(); 
	Prenotazione trovaUno(int id);
	void addPrenotazione(Prenotazione p); 

}
