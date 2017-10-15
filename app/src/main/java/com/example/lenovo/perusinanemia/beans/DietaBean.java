package com.example.lenovo.perusinanemia.beans;

import java.io.Serializable;

/**
 * Created by ASUS on 14/10/2017.
 */

public class DietaBean implements Serializable {

    private int id_dieta;
    private String alimento;
    private String frecuencia;
    private int cant_sug;

    public DietaBean() {
    }

    public DietaBean(int id_dieta, String alimento, String frecuencia, int cant_sug) {
        this.id_dieta = id_dieta;
        this.alimento = alimento;
        this.frecuencia = frecuencia;
        this.cant_sug = cant_sug;
    }

    public int getId_dieta() {
        return id_dieta;
    }

    public void setId_dieta(int id_dieta) {
        this.id_dieta = id_dieta;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getCant_sug() {
        return cant_sug;
    }

    public void setCant_sug(int cant_sug) {
        this.cant_sug = cant_sug;
    }
}
