package net.logcodapps.apma.model;

import java.math.BigDecimal;
import java.util.Calendar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Associacao {

	private BigDecimal chave;
	private String descricao;
	private String cnpj;
	private Calendar dataCriacao;
	private String codigoIdentificador;
	private Endereco endereco;
	private String celular_1;
	private String celular_2;
	private String celular_3;

}
