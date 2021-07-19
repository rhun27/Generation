package agViaggi.service;

import java.util.List;

import agViaggi.entities.Viaggio;

public interface ViaggioService {
	
	List<Viaggio> trovaTutti();
	Viaggio trovaUno(int id);

}
