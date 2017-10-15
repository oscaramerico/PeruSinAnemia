package com.example.lenovo.perusinanemia.beans;

import java.io.Serializable;

/**
 * Created by ASUS on 14/10/2017.
 */

public class ControlBean implements Serializable {

    private int id_control;
    private String dni_apod;
    private String dni_cui;
    private String criterio_control;
    private int cant_controles;

    public ControlBean() {
    }

    public ControlBean(int id_control, String dni_apod, String dni_cui, String criterio_control, int cant_controles) {
        this.id_control = id_control;
        this.dni_apod = dni_apod;
        this.dni_cui = dni_cui;
        this.criterio_control = criterio_control;
        this.cant_controles = cant_controles;
    }

    public int getId_control() {
        return id_control;
    }

    public void setId_control(int id_control) {
        this.id_control = id_control;
    }

    public String getDni_apod() {
        return dni_apod;
    }

    public void setDni_apod(String dni_apod) {
        this.dni_apod = dni_apod;
    }

    public String getDni_cui() {
        return dni_cui;
    }

    public void setDni_cui(String dni_cui) {
        this.dni_cui = dni_cui;
    }

    public String getCriterio_control() {
        return criterio_control;
    }

    public void setCriterio_control(String criterio_control) {
        this.criterio_control = criterio_control;
    }

    public int getCant_controles() {
        return cant_controles;
    }

    public void setCant_controles(int cant_controles) {
        this.cant_controles = cant_controles;
    }
}
