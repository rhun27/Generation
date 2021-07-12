package esAgenzia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import esAgenzia.dal.ViaggioDAO;
import esAgenzia.entities.Viaggio;

public class ViaggioServiceImpl implements ViaggioService {
	
	@Autowired
	ViaggioDAO vd;

	@Override
	public List<Viaggio> trovaTutti() {
		return vd.findAll();
	}

	@Override
	public Viaggio trovaUno(int id) {
		return vd.findById(id).get();
	}

}
