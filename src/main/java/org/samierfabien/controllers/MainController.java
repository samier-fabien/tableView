package org.samierfabien.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.samierfabien.tools.Customer;

/**
 * Contrôleur principal qui gère mainVue.fxml
 */
public class MainController {
    private ObservableList<Customer> model = FXCollections.observableArrayList();
    @FXML
    private TableView<Customer> customers;
    @FXML
    private TableColumn<Customer, String> firstNameColumn;
    @FXML
    private TableColumn<Customer, String> lastNameColumn;
    @FXML
    private TableColumn<Customer, String> cityColumn;
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
    public void initialize() {
        populate();

        firstNameColumn.setCellValueFactory(new PropertyValueFactory<Customer, String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<Customer, String>("lastName"));
        cityColumn.setCellValueFactory(new PropertyValueFactory<Customer, String>("city"));

        customers.setItems(model);
    }

    /**
     * Ajoute dans model un objet Customer qui contient
     * le texte saisi dans les TextField "forstName", "lastname" et "city".
     * @return void
     */
    public void save() {
        model.add(new Customer(firstNameText.getText(), lastNameText.getText(), cityText.getText()));
    }

    /**
     * Retire le texte saisi dans les TextField "forstName", "lastname" et "city".
     * @return void
     */
    public void cancel() {
        firstNameText.clear();
        lastNameText.clear();
        cityText.clear();
    }

    /**
     * Supprime un objet Customer de model.
     * @return void
     */
    public void delete() {
        model.remove(customers.getSelectionModel().getSelectedItem());
    }

    /**
     * Ajoute quelques objets Customers dans model.
     * @return void
     */
    public void populate() {
        model.add(new Customer("Josh", "Homme", "Joshua Tree"));
        model.add(new Customer("Dave", "Grohl", "Warren"));
        model.add(new Customer("Krist", "Novoselic", "Compton"));
        model.add(new Customer("Robert", "Trujillo", "Santa Monica"));
    }
}
