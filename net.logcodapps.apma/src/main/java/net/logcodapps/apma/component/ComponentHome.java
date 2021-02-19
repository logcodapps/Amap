package net.logcodapps.apma.component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import net.logcodapps.apma.App;

@Data
@Getter
@Setter
public class ComponentHome implements Initializable {
	@FXML
	private BorderPane component_home_display;
	@FXML
	private Hyperlink btAssociado;
	@FXML
	private Hyperlink btAssociocao;
	@FXML
	private Hyperlink btfuncionario;
	@FXML
	private ImageView image_logo;

	private App component;

	public void initialize(URL location, ResourceBundle resources) {
		image_logo.setImage(new Image(getClass().getClassLoader().getResourceAsStream("images/if-sta.jpg")));

	}
	@FXML
	public void componentAssociacaoEvent(ActionEvent event) throws IOException {
		component.displayAssociationFrame("display/Component-entity.fxml");
	}
	@FXML
	public void componentAssociadoEvent(ActionEvent event) throws IOException {
		component.displayAssociadoFrame("display/Component-client.fxml");
	}
	@FXML
	public void componentFuncianarioEvent(ActionEvent event) throws IOException {
		component.displayAssociationFrame("display/Component-associacao.fxml");
	}

}
