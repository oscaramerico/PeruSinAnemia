package com.example.lenovo.perusinanemia.beans;

import java.io.Serializable;

/**
 * Created by ASUS on 14/10/2017.
 */

public class JobBean implements Serializable {

    private String dni_jobs;
    private String apellido;
    private String nombre;
    private String cargo;
    private String cod_colegiatura;
    private String centro_salud;

    public JobBean(){}
    public JobBean(String dni_jobs, String apellido, String nombre, String cargo, String cod_colegiatura, String centro_salud) {
        this.dni_jobs = dni_jobs;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cargo = cargo;
        this.cod_colegiatura = cod_colegiatura;
        this.centro_salud = centro_salud;
    }

    public String getDni_jobs() {
        return dni_jobs;
    }

    public void setDni_jobs(String dni_jobs) {
        this.dni_jobs = dni_jobs;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCod_colegiatura() {
        return cod_colegiatura;
    }

    public void setCod_colegiatura(String cod_colegiatura) {
        this.cod_colegiatura = cod_colegiatura;
    }

    public String getCentro_salud() {
        return centro_salud;
    }

    public void setCentro_salud(String centro_salud) {
        this.centro_salud = centro_salud;
    }
}
