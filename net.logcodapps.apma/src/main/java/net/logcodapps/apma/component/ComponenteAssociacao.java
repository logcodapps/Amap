package net.logcodapps.apma.component;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Paint;
import javafx.util.Duration;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import net.logcodapps.apma.App;
import net.logcodapps.apma.utilits.Utilits;

@Data
@Getter
@Setter
public class ComponenteAssociacao implements Initializable {

	@FXML
	private TextField text_descricao;
	@FXML
	private TextField text_cnpj;
	@FXML
	private TextField text_dataCriacao;
	@FXML
	private TextField text_codigoIdentificador;

	@FXML
	private Button btConect;
	@FXML
	private TextField txt_endereco;
	@FXML
	private TextField txt_ref;
	@FXML
	private ImageView img_logo;
	@FXML
	private TextField txt_login, txt_senha;
	@FXML
	private Label lbMsg;
	@FXML
	private BorderPane display_associcao;
	@FXML
	private ScrollPane comp_scrol;

	private App component;

	public void initialize(URL location, ResourceBundle resources) {
		img_logo.setImage(new Image(getClass().getClassLoader().getResourceAsStream("images/logo.jpeg")));
	}

	/*
	 * @FXML public void eviando(ActionEvent event) throws IOException { if
	 * (Objects.equals(txt_login.getText(), "diocesse") &&
	 * Objects.equals(txt_senha.getText(), "1@cuca82")) {
	 * System.out.println("Testando evento ....");
	 * component.displayAssociadoFrame("display/Component-client.fxml"); } else {
	 * lbMsg.setText("Login ou senha invalido!");
	 * lbMsg.setTextFill(Paint.valueOf("red")); Utilits.animateMessage(lbMsg); }
	 * 
	 * }
	 */

}
