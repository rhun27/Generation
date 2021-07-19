package agViaggi.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import agViaggi.entities.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Integer> {

}
