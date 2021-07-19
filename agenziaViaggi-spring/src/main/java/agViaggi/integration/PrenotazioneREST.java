package agViaggi.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import agViaggi.entities.Prenotazione;
import agViaggi.service.PrenotazioneService;

@RestController
@RequestMapping("api/prenotazioni")
public class PrenotazioneREST {
	
	@Autowired
	PrenotazioneService ps;
	
	@GetMapping("")
	public List<Prenotazione> trovaPrenotazioni() {
		return ps.trovatutte();
	}

}
