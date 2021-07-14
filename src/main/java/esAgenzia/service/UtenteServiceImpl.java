package esAgenzia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import esAgenzia.dal.UtenteDAO;
import esAgenzia.entities.Utente;

@Service
public class UtenteServiceImpl implements UtenteService {

	@Autowired
	UtenteDAO ud;
	
	@Override
	public List<Utente> trovaTutti() {
		return ud.findAll();
	}

	@Override
	public Utente trovaById(int id) {
		return ud.findById(id).get();
	}

	@Override
	public void aggiungiUtente() {

	}

	@Override
	public void aggiungiUtente(String nome, String cognome, String email, int nCarta) {
		Utente u = new Utente(0, nome, cognome, email, nCarta);
		ud.findAll().add(u);
	}

}
