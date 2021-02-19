package net.logcodapps.apma.bean;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;

import net.logcodapps.apma.config.Config;
import net.logcodapps.apma.model.Associacao;
import net.logcodapps.apma.model.repository.AssociacaoRepository;

public class BeanAssociacao implements AssociacaoRepository {
   protected Connection con; 
   protected Config config;
	public BeanAssociacao() {
		config = Config.acessarMariaDB();
		con = config.getConn();
		
	}
	
	public String enviar(Associacao associacao) {
		// TODO Auto-generated method stub
		return "Enviado";
	}

	public Associacao findAssociacaoByChave(BigDecimal chave) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Associacao> findAssociacaoByCodigoIdentificador(BigDecimal chave) {
		// TODO Auto-generated method stub
		return null;
	}

	public String delete(BigDecimal chave) {
		// TODO Auto-generated method stub
		return null;
	}

	public String update(BigDecimal chave) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Associacao> findAssociacaoByDescricao(String select) {
		// TODO Auto-generated method stub
		return null;
	}

}
