package esAgenzia.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import esAgenzia.entities.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Integer> {

}
