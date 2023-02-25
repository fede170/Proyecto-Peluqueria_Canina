package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idDuenio;
    
    private String nombre;
    private String celDuenio;

    public Duenio() {
    }

    public Duenio(Long idDuenio, String nombre, String celDuenio) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
    }

    public Long getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(Long idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
    
}
