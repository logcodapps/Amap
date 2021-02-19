package net.logcodapps.apma.component;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import net.logcodapps.apma.App;

@Data
@Setter
@Getter
public class ComponenteAssociado implements Initializable {
	@FXML
	private BorderPane component_associado;
	@FXML
	private ImageView img_perfil;

	private App ComponentAssociado;
	@FXML
	private TextField txt_nome, txt_dtn, txt_sexo;

	public void initialize(URL location, ResourceBundle resources) {
		img_perfil.setImage(new Image(getClass().getClassLoader().getResourceAsStream("images/logo.jpeg")));
	}

	@FXML
	public void enviar(ActionEvent event) {
		System.out.println("Nome: " + txt_nome.getText());
		System.out.println("Data Nascimento: " + txt_dtn.getText());
		System.out.println("Sexo: " + txt_sexo.getText());
	}

}
