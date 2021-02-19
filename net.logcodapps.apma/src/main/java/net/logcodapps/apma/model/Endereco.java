package net.logcodapps.apma.model;

import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Data
@Getter
@Setter
@ToString
public class Endereco {

	private BigDecimal chave;
	private String estado;
	private String nome;
	private String bairro;
	private String cidade;
}
