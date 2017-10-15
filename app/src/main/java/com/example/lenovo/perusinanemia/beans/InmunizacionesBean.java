package com.example.lenovo.perusinanemia.beans;

import java.io.Serializable;

/**
 * Created by ASUS on 14/10/2017.
 */

public class InmunizacionesBean implements Serializable {

    private int id_inmu;
    private String dni_apod;
    private String dni_cui;
    private String des_inmu;
    private int cant_dosis;

    public InmunizacionesBean() {
    }

    public InmunizacionesBean(int id_inmu, String dni_apod, String dni_cui, String des_inmu, int cant_dosis) {
        this.id_inmu = id_inmu;
        this.dni_apod = dni_apod;
        this.dni_cui = dni_cui;
        this.des_inmu = des_inmu;
        this.cant_dosis = cant_dosis;
    }

    public int getId_inmu() {
        return id_inmu;
    }

    public void setId_inmu(int id_inmu) {
        this.id_inmu = id_inmu;
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

    public String getDes_inmu() {
        return des_inmu;
    }

    public void setDes_inmu(String des_inmu) {
        this.des_inmu = des_inmu;
    }

    public int getCant_dosis() {
        return cant_dosis;
    }

    public void setCant_dosis(int cant_dosis) {
        this.cant_dosis = cant_dosis;
    }
}
