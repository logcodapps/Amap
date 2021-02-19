package net.logcodapps.apma.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class Config {

	private static Config config;
	private static Connection conn;

	public static Config acessarMariaDB() {
		return (Objects.isNull(config)) ? new Config() : config;
	}

	private Config() {
		try {
			Class.forName("org.mariadb.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/associacao_pescadores", "root", "root");
			System.out.println("Conectado ...");
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public Connection getConn() {
		return conn;
	}
	public static void main(String[] args) {
		Config config = Config.acessarMariaDB();
	}
}
