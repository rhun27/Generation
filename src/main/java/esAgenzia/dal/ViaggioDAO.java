package esAgenzia.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import esAgenzia.entities.Viaggio;

@Repository
public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {

}
