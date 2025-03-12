package es.ieslosmontecillos.entidades;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.XmlElement;

public class Usuario {
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty email = new SimpleStringProperty();
    private final StringProperty password = new SimpleStringProperty();
    private final StringProperty vigencia = new SimpleStringProperty();

    //campo id
    @XmlElement(name = "id")
    public Integer getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(Integer id) {
        this.id.set(id);
    }

    //campo email
    @XmlElement(name = "email")
    public String getEmail() {
        return email.get();
    }
    public StringProperty emailProperty() {
        return email;
    }
    public void setEmail(String email) {
        this.email.set(email);
    }
    @XmlElement(name = "password")
    public String getPassword() {
        return password.get();
    }
    public StringProperty passwordProperty() {
        return password;
    }
    public void setPassword(String password) {
        this.password.set(password);
    }
    @XmlElement(name = "vigencia")
    public String getVigencia() {
        return vigencia.get();
    }
    public StringProperty vigenciaProperty() {
        return vigencia;
    }
    public void setVigencia(String vigencia) {
        this.vigencia.set(vigencia);
    }
}