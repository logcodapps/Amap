package net.logcodapps.apma.model;

import java.math.BigDecimal;

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

public class Associado {
	private BigDecimal chave;
	private String nome;
}
