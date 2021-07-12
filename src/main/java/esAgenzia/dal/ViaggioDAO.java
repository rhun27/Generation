package esAgenzia.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import esAgenzia.entities.Viaggio;

public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {

}
