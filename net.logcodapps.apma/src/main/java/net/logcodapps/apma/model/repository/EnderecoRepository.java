package net.logcodapps.apma.model.repository;

import java.util.List;

import net.logcodapps.apma.model.Endereco;

public interface EnderecoRepository {
	
	public String enviar(Endereco endereco);
	
	public List<Endereco> findEnderecoByChave(long chave);
	
	public List<Endereco> findEnderecoByCidade(String cidade);
	
	public List<Endereco> findEnderecoByBairro(String bairro);
	
	public List<Endereco> findEnderecoByNome(String nome);

}
