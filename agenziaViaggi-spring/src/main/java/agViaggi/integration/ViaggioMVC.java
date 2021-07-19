package agViaggi.integration;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import agViaggi.entities.Prenotazione;
import agViaggi.entities.Utente;
import agViaggi.entities.Viaggio;
import agViaggi.model.Form;
import agViaggi.service.PrenotazioneService;
import agViaggi.service.UtenteService;
import agViaggi.service.ViaggioService;

@Controller
@RequestMapping("/mvc")
public class ViaggioMVC {

	@Autowired
	ViaggioService vs;
	@Autowired
	UtenteService us;
	@Autowired
	PrenotazioneService ps;

	@RequestMapping("/pay/{id}")
	public String pagamento(@PathVariable int id, Model m) {
		Viaggio v = vs.trovaUno(id);
		m.addAttribute("viaggio", v);
		return "payment";
	}

	@PostMapping("/aggiungi")
	public String conferma(@ModelAttribute Form f, Model m) {
		List<String> errori = new ArrayList<String>();
		Prenotazione p = new Prenotazione();

		// qui faccio i miei controlli
		if (f != null) {
			if (f.getCognome() == "" || f.getEmail() == "" || f.getNome() == "" || f.getnCarta() == "") {
				errori.add("non hai compilato un campo");
			}
			else {
				for (Utente u : us.trovaTutti()) {
					if (u.getEmail().equals(f.getEmail())) {
						p = new Prenotazione(u.getId(), f.getIdViaggio(), (vs.trovaUno(f.getIdViaggio()).getPrezzoPersona() * f.getPasseggeri()));
						ps.addPrenotazione(p);
						break;
					}
					else {
						BigInteger bi = new BigInteger(f.getnCarta());
						Utente ut = new Utente(f.getNome(), f.getCognome(), f.getEmail(), bi);
						us.aggiungiUtente(ut);
						p = new Prenotazione(ut.getId(), f.getIdViaggio(), (vs.trovaUno(f.getIdViaggio()).getPrezzoPersona() * f.getPasseggeri()));
						ps.addPrenotazione(p);
						break;
					}
				}
			}
		}
		else
			errori.add("format non valido");

		
		if (errori.size() > 0) {
			m.addAttribute("formUtente", f);
			m.addAttribute("errori", "Hai sbagliato qualcosa");
			
			return "payment";
		}
		else {
			m.addAttribute("prenotazione", p);
			m.addAttribute("utente", us.trovaById(p.getUtente_id()));
			m.addAttribute("viaggio", vs.trovaUno(p.getViaggio_id()));
			
			return "conferma";			
		}
	}

}
