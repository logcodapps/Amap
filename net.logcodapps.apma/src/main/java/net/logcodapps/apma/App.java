package net.logcodapps.apma;

import java.io.IOException;
import java.io.InputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import net.logcodapps.apma.component.ComponentCargo;
import net.logcodapps.apma.component.ComponentHome;
import net.logcodapps.apma.component.ComponenteAssociacao;
import net.logcodapps.apma.component.ComponenteAssociado;
import net.logcodapps.apma.component.ComponenteFuncionario;

public class App extends Application {

	public static void main(String[] args) {
		App.launch(App.class, args);
	}

	private Stage display;

	@Override
	public void start(Stage stage) throws Exception {
		this.display = stage;
		stage.setTitle("Sistema de Cadastro - APMA");
		displayComponentCargo("display/Ui-cargo.fxml");
		stage.show();
	}

	public Initializable initComponent(String display) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		InputStream stream = getClass().getClassLoader().getResourceAsStream(display);
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		loader.setLocation(getClass().getClassLoader().getResource(display));
		BorderPane borderPane = (BorderPane) loader.load(stream);
		stream.close();
		Scene scene = new Scene(borderPane);
		this.display.setScene(scene);
		this.display.sizeToScene();
		return (Initializable) loader.getController();
	}

	public ComponenteAssociacao displayAssociationFrame(String display) throws IOException {
		ComponenteAssociacao componenteAssociacao = (ComponenteAssociacao) initComponent(display);
		componenteAssociacao.setComponent(this);
		return componenteAssociacao;
	}

	public ComponenteAssociado displayAssociadoFrame(String display) throws IOException {
		ComponenteAssociado componenteAssociado = (ComponenteAssociado) initComponent(display);
		componenteAssociado.setComponentAssociado(this);
		return componenteAssociado;
	}

	public ComponenteFuncionario displayFuncionarioFrame(String display) throws IOException {
		ComponenteFuncionario componenteFuncionario = (ComponenteFuncionario) initComponent(display);
		componenteFuncionario.setComponent(this);
		return componenteFuncionario;
	}
	
	public ComponentHome displayComponentHome(String display) throws IOException {
		ComponentHome componentHome = (ComponentHome) initComponent(display);
		componentHome.setComponent(this);
		return componentHome;
	}

	public ComponentCargo displayComponentCargo(String display) throws IOException {
		ComponentCargo component = (ComponentCargo) initComponent(display);
		component.setComponent(this);
		return component;
	}

}
