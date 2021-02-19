package net.logcodapps.apma.component;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import net.logcodapps.apma.App;
import net.logcodapps.apma.bean.BeanCargo;
import net.logcodapps.apma.model.Cargo;
import net.logcodapps.apma.model.repository.CargoRepository;

@Data
@Setter
@Getter
public class ComponentCargo implements Initializable {
	@FXML
	private BorderPane component_cargo;
	@FXML
	private TextField txt_nome_cargo, txt_filtro;
	@FXML
	private Button btEnviar;
	@FXML
	private TableView<Cargo> tableViewCargos;
	@FXML
	private TableColumn<Cargo, Object> colId;
	@FXML
	private TableColumn<Cargo, Object> colNome;
	@FXML
	private TableColumn<Cargo, Object> colbtAcao;

	private App component;
	CargoRepository beanCargo = new BeanCargo();
	private ObservableList<Cargo> cargos;
	BigDecimal chave = null;

	@FXML
	public void atualizarFiltrando(KeyEvent e) {
		atualizarTableViewCargos(txt_filtro.getText());
	}

	public void atualizarTableViewCargos(String filtro) {
		cargos = FXCollections.observableArrayList(beanCargo.findCargoByNomeCargo(filtro));
		colId.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Cargo, Object>, ObservableValue<Object>>() {
			public ObservableValue<Object> call(CellDataFeatures<Cargo, Object> param) {
				// TODO Auto-generated method stub
				return new SimpleObjectProperty<Object>(param.getValue().getIdCargo());
			}
		});
		colNome.setCellValueFactory(
				new Callback<TableColumn.CellDataFeatures<Cargo, Object>, ObservableValue<Object>>() {
					public ObservableValue<Object> call(CellDataFeatures<Cargo, Object> param) {
						return new SimpleObjectProperty<Object>(param.getValue().getNome_cargo());
					}
				});
		colbtAcao.setCellValueFactory(
				new Callback<TableColumn.CellDataFeatures<Cargo, Object>, ObservableValue<Object>>() {
					public ObservableValue<Object> call(final CellDataFeatures<Cargo, Object> param) {
						Button linkEdit = new Button("Editar");
						linkEdit.setOnAction(new EventHandler<ActionEvent>() {
							public void handle(ActionEvent event) {
								chave = param.getValue().getIdCargo();
								txt_nome_cargo.setText(param.getValue().getNome_cargo());
							}
						});
						return new SimpleObjectProperty<Object>(linkEdit);
					}
				});

		tableViewCargos.setItems(cargos);
	}

	public boolean validateCampos() {
		if (txt_nome_cargo.getText().length() == 0) {
			txt_nome_cargo.setPromptText("Nome não pode está em branco?");
			return false;
		}
		return true;
	}

	public void initialize(URL location, ResourceBundle resources) {
		atualizarTableViewCargos("");
		btEnviar.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Cargo cargo = new Cargo();
				cargo.setNome_cargo(txt_nome_cargo.getText().trim());
				if (validateCampos())
					if (Objects.isNull(chave)) {
						beanCargo.enviar(cargo);
					} else {
						beanCargo.enviar(chave, cargo);
						chave = null;
					}
				atualizarTableViewCargos("");
			}
		});

	}
}
