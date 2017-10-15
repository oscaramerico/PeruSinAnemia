package com.example.lenovo.perusinanemia.beans;

import java.io.Serializable;

/**
 * Created by ASUS on 14/10/2017.
 */

public class NiñoBean implements Serializable {

    private String dni_cui;
    private String dni_apod;
    private String apellido;
    private String nombre;
    private String sexo;
    private int edad;
    private String f_nac;
    private String lug_nac;
    private String domi;
    private String grup_sang;

    public NiñoBean() {
    }

    public NiñoBean(String dni_cui, String dni_apod, String apellido, String nombre, String sexo, int edad,
                    String f_nac, String lug_nac, String domi, String grup_sang) {
        this.dni_cui = dni_cui;
        this.dni_apod = dni_apod;
        this.apellido = apellido;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.f_nac = f_nac;
        this.lug_nac = lug_nac;
        this.domi = domi;
        this.grup_sang = grup_sang;
    }

    public String getDni_cui() {
        return dni_cui;
    }

    public void setDni_cui(String dni_cui) {
        this.dni_cui = dni_cui;
    }

    public String getDni_apod() {
        return dni_apod;
    }

    public void setDni_apod(String dni_apod) {
        this.dni_apod = dni_apod;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getF_nac() {
        return f_nac;
    }

    public void setF_nac(String f_nac) {
        this.f_nac = f_nac;
    }

    public String getLug_nac() {
        return lug_nac;
    }

    public void setLug_nac(String lug_nac) {
        this.lug_nac = lug_nac;
    }

    public String getDomi() {
        return domi;
    }

    public void setDomi(String domi) {
        this.domi = domi;
    }

    public String getGrup_sang() {
        return grup_sang;
    }

    public void setGrup_sang(String grup_sang) {
        this.grup_sang = grup_sang;
    }
}
