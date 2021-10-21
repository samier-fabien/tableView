package org.samierfabien.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.samierfabien.models.Table;
import org.samierfabien.tools.Client;

public class MainController {
    Table model = new Table();
    @FXML
    private TableView<Client> Clients;
    @FXML
    private TableColumn<Client, String> firstNameColumn;
    @FXML
    private TableColumn<Client, String> lastNameColumn;
    @FXML
    private TableColumn<Client, String> cityColumn;
    @FXML
    private TextField firstNameText;
    @FXML
    private TextField lastNameText;
    @FXML
    private TextField cityText;
    @FXML
    private Button saveButton;
    @FXML
    private Button cancelButton;
    @FXML
    private Button deleteButton;


    public MainController() {}

    @FXML
    public void intitialize() {
        model.getTable().add(new Client("Josh", "Homme", "Joshua Tree"));
        model.getTable().add(new Client("Dave", "Grohl", "Warren"));
        model.getTable().add(new Client("Krist", "Novoselic", "Compton"));
        model.getTable().add(new Client("Robert", "Trujillo", "Santa Monica"));

        firstNameColumn.setCellFactory(new PropertyValueFactory<>());
    }

    public void save() {

    }

    public void cancel() {

    }

    public void delete() {

    }
}
