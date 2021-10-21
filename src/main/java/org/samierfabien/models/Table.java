package org.samierfabien.models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import org.samierfabien.tools.Client;

public class Table {
    private ObservableList<Client> table = FXCollections.observableArrayList();

    public ObservableList<Client> getTable() {
        return table;
    }

    public void setTable(ObservableList<Client> table) {
        this.table = table;
    }
}
