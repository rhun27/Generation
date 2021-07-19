package agViaggi.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import agViaggi.entities.Viaggio;

public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {

}
