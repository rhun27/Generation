package agViaggi.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import agViaggi.entities.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
