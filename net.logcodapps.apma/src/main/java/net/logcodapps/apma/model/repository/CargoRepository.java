package net.logcodapps.apma.model.repository;

import java.math.BigDecimal;
import java.util.List;

import net.logcodapps.apma.model.Cargo;

public interface CargoRepository {
	
	public String enviar(Cargo cargo);
	
	public List<Cargo> findCargoByNomeCargo(String nome);
	
	public String enviar(BigDecimal key,Cargo cargo) ;
}
