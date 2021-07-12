package esAgenzia.service;

import java.util.List;

import esAgenzia.entities.Viaggio;

public interface ViaggioService {
	
	List<Viaggio> trovaTutti();
	Viaggio trovaUno(int id);

}
