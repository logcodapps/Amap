package net.logcodapps.apma.model.repository;

import java.math.BigDecimal;

import net.logcodapps.apma.model.Funcionario;

public interface FuncionarioRepository {

	public boolean findFuncionarioBy_LoginSenha(String login, String senha);

	public Funcionario findFuncionarioByChave(BigDecimal chave);
	
	public Funcionario findFuncionarioByLogin_Senha(String login,String senha);

}
