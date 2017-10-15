package com.example.lenovo.perusinanemia.beans;

import java.io.Serializable;

/**
 * Created by ASUS on 14/10/2017.
 */

public class Dieta_DetailBean implements Serializable {

    private int id_dieta;
    private String dni_apod;
    private String dni_cui;

    public Dieta_DetailBean() {
    }

    public Dieta_DetailBean(int id_dieta, String dni_apod, String dni_cui) {
        this.id_dieta = id_dieta;
        this.dni_apod = dni_apod;
        this.dni_cui = dni_cui;
    }

    public int getId_dieta() {
        return id_dieta;
    }

    public void setId_dieta(int id_dieta) {
        this.id_dieta = id_dieta;
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
}
