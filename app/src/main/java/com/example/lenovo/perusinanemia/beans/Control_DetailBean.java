package com.example.lenovo.perusinanemia.beans;

import java.io.Serializable;

/**
 * Created by ASUS on 14/10/2017.
 */

public class Control_DetailBean implements Serializable {

    private int id_control;
    private double pes_act;
    private double tal_act;
    private String fec_control;

    public Control_DetailBean() {
    }

    public Control_DetailBean(int id_control, double pes_act, double tal_act, String fec_control) {
        this.id_control = id_control;
        this.pes_act = pes_act;
        this.tal_act = tal_act;
        this.fec_control = fec_control;
    }

    public int getId_control() {
        return id_control;
    }

    public void setId_control(int id_control) {
        this.id_control = id_control;
    }

    public double getPes_act() {
        return pes_act;
    }

    public void setPes_act(double pes_act) {
        this.pes_act = pes_act;
    }

    public double getTal_act() {
        return tal_act;
    }

    public void setTal_act(double tal_act) {
        this.tal_act = tal_act;
    }

    public String getFec_control() {
        return fec_control;
    }

    public void setFec_control(String fec_control) {
        this.fec_control = fec_control;
    }
}
