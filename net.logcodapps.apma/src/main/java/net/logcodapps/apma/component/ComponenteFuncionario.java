package net.logcodapps.apma.component;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Paint;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import net.logcodapps.apma.App;
import net.logcodapps.apma.bean.BeanFuncionario;
import net.logcodapps.apma.model.Funcionario;
import net.logcodapps.apma.model.repository.FuncionarioRepository;
import net.logcodapps.apma.utilits.Utilits;

@Data
@Setter
@Getter
public class ComponenteFuncionario implements Initializable {
	@FXML
	private TextField txt_login, txt_senha;
	@FXML
	private Label lbMsg;
	@FXML
	private BorderPane display_associcao;
	@FXML
	private Button btConect;
	@FXML
	private ImageView img_logo;
	
	private App component;
	
	private  Funcionario funcionario;

	public void initialize(URL location, ResourceBundle resources) {
		img_logo.setImage(new Image(getClass().getClassLoader().getResourceAsStream("images/logo.jpeg")));

	}

	@FXML
	public void eviando(ActionEvent event) throws IOException {
		FuncionarioRepository fr = new BeanFuncionario();
		if (fr.findFuncionarioBy_LoginSenha(txt_login.getText().trim(), txt_senha.getText().trim())) {
	      component.displayComponentHome("display/Component-main.fxml");
		} else {
			lbMsg.setText("Login ou senha invalido!");
			lbMsg.setTextFill(Paint.valueOf("red"));
			Utilits.animateMessage(lbMsg);
		}

	}

}
