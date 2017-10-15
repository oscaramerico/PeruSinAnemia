package com.example.lenovo.perusinanemia.beans;

import java.io.Serializable;

/**
 * Created by ASUS on 14/10/2017.
 */

public class TamizajeBean implements Serializable {

    private int id_tamiza;
    private String dni_apod;
    private String dni_cui;
    private String fec_prueba;
    private int cant_hem;

    public TamizajeBean() {
    }

    public TamizajeBean(int id_tamiza, String dni_apod, String dni_cui, String fec_prueba, int cant_hem) {
        this.id_tamiza = id_tamiza;
        this.dni_apod = dni_apod;
        this.dni_cui = dni_cui;
        this.fec_prueba = fec_prueba;
        this.cant_hem = cant_hem;
    }

    public int getId_tamiza() {
        return id_tamiza;
    }

    public void setId_tamiza(int id_tamiza) {
        this.id_tamiza = id_tamiza;
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

    public String getFec_prueba() {
        return fec_prueba;
    }

    public void setFec_prueba(String fec_prueba) {
        this.fec_prueba = fec_prueba;
    }

    public int getCant_hem() {
        return cant_hem;
    }

    public void setCant_hem(int cant_hem) {
        this.cant_hem = cant_hem;
    }
}
