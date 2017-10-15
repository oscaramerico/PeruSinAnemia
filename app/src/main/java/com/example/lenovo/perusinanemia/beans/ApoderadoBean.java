package com.example.lenovo.perusinanemia.beans;


import java.io.Serializable;

/**
 * Created by ASUS on 14/10/2017.
 */

public class ApoderadoBean implements Serializable {

    private String dni_apod;
    private String apellido;
    private String nombre;
    private int edad;
    private String gra_instr;
    private String ocupacion;
    private String est_civil;
    private String telefono;
    private String dni_jobs;
    private String tipo;

    public ApoderadoBean() {
    }

    public ApoderadoBean(String dni_apod, String apellido, String nombre, int edad, String gra_instr,
                         String ocupacion, String est_civil, String telefono, String dni_jobs, String tipo) {
        this.dni_apod = dni_apod;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.gra_instr = gra_instr;
        this.ocupacion = ocupacion;
        this.est_civil = est_civil;
        this.telefono = telefono;
        this.dni_jobs = dni_jobs;
        this.tipo = tipo;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGra_instr() {
        return gra_instr;
    }

    public void setGra_instr(String gra_instr) {
        this.gra_instr = gra_instr;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEst_civil() {
        return est_civil;
    }

    public void setEst_civil(String est_civil) {
        this.est_civil = est_civil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni_jobs() {
        return dni_jobs;
    }

    public void setDni_jobs(String dni_jobs) {
        this.dni_jobs = dni_jobs;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
