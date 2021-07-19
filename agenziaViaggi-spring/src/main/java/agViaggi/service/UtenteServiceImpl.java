package agViaggi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import agViaggi.dal.UtenteDAO;
import agViaggi.entities.Utente;

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
	public void aggiungiUtente(Utente u) {
		ud.save(u);
	}

}
