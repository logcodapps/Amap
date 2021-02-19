package net.logcodapps.apma.bean;

import java.math.BigDecimal;
import java.util.Objects;

import net.logcodapps.apma.model.Funcionario;
import net.logcodapps.apma.model.repository.FuncionarioRepository;

public class BeanFuncionario implements FuncionarioRepository {

	public boolean findFuncionarioBy_LoginSenha(String login, String senha) {
		if (Objects.equals(login, "diocesse") && Objects.equals(senha, "1010010")) {
			return true;
		}
		return false;
	}

	public Funcionario findFuncionarioByChave(BigDecimal chave) {
		// TODO Auto-generated method stub
		return null;
	}

	public Funcionario findFuncionarioByLogin_Senha(String login, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

}
