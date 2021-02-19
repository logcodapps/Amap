package net.logcodapps.apma.bean;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.logcodapps.apma.config.Config;
import net.logcodapps.apma.model.Cargo;
import net.logcodapps.apma.model.repository.CargoRepository;

public class BeanCargo implements CargoRepository {
	protected Connection con;
	protected Config config;

	public BeanCargo() {
		config = Config.acessarMariaDB();
		con = config.getConn();

	}
	public List<Cargo> findCargoByNomeCargo(String nome) {
		try {
			PreparedStatement ps = con.prepareStatement("select * from cargo c where c.nome_cargo like ?");
			ps.setString(1, "%"+nome+"%");
			ResultSet rs = ps.executeQuery();
			List<Cargo> cargos = new ArrayList<Cargo>();
			while (rs.next()) {
				Cargo cargo = new Cargo(rs.getBigDecimal(1),rs.getString(2));
				cargos.add(cargo);
			}
			return cargos;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public String enviar(Cargo cargo) {
		try {
			PreparedStatement ps = con.prepareStatement("insert into cargo(nome_cargo) values (?)");
			ps.setObject(1, cargo.getNome_cargo());
			ps.execute();
			return "Enviado";
		} catch (SQLException e) {
			System.err.println(e);
			return "Cancelado";
		}

	}
	
	public String enviar(BigDecimal key,Cargo cargo) {
		try {
			PreparedStatement ps = con.prepareStatement("update cargo set nome_cargo=? where idcargo = ?");
			ps.setObject(1, cargo.getNome_cargo());
			ps.setObject(2, key);
			ps.execute();
			return "Enviado";
		} catch (SQLException e) {
			System.err.println(e);
			return "Cancelado";
		}

	}

}
