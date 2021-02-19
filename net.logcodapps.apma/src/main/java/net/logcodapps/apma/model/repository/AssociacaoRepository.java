package net.logcodapps.apma.model.repository;

import java.math.BigDecimal;
import java.util.List;

import net.logcodapps.apma.model.Associacao;

public interface AssociacaoRepository {

	public String enviar(Associacao associacao);
	
	public Associacao findAssociacaoByChave(BigDecimal chave);
	
	public List<Associacao> findAssociacaoByCodigoIdentificador(BigDecimal chave);
	
	public String delete(BigDecimal chave);
	
	public String update(BigDecimal chave);
	
	public List<Associacao> findAssociacaoByDescricao(String select);
	
	
}
