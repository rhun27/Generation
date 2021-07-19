package agViaggi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import agViaggi.dal.PrenotazioneDAO;
import agViaggi.entities.Prenotazione;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService {
	
	@Autowired
	PrenotazioneDAO pd;

	@Override
	public List<Prenotazione> trovatutte() {
		return pd.findAll(); 
	}

	@Override
	public Prenotazione trovaUno(int id) {
		return pd.findById(id).get();
	}

	@Override
	public void addPrenotazione(Prenotazione p) {
		pd.save(p); 
	}

}
