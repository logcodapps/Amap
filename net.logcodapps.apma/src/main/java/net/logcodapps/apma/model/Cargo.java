package net.logcodapps.apma.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class Cargo {
private BigDecimal idCargo;
private String nome_cargo;
}
