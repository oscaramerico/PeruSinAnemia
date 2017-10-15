package com.example.lenovo.perusinanemia.connection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ASUS on 14/10/2017.
 */

public class Myconnection extends SQLiteOpenHelper {

    public static String dbName="SinAnemiaDB";
    public Myconnection(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tbJobs="create table tbJobs(dni_jobs text primary key, apellido text,nombre text," +
                "cargo text ,cod_colegiatuara text, centro_salud text );";

        String tbApoderado="create table tbApoderado(dni_apod text primary key, apellido text,nombre text,edad int,gra_instr text," +
                " ocupacion text,est_civil text,telefono text,dni_jobs text,tipo text);";

        String tbNiño="create table tbNiño(dni_cui text primary key,dni_apod text, apellido text,nombre text," +
                "sexo text,edad int, f_nac text, lug_nac text, domi text, grup_sang text);";

        String tbDieta="create table tbDieta(id_dieta INTEGER PRIMARY KEY AUTOINCREMENT,alimento text, frecuencia text,cant_sug int);";

        String tbDieta_Detail="create table tbDieta_Detail(id_dieta int ,dni_apod text " +
                ",dni_cui text );";

        String tbControl="create table tbControl(id_control INTEGER PRIMARY KEY AUTOINCREMENT,dni_apod text," +
                "dni_cui text ,criterio_control text, cant_controles int);";

        String tbControl_Detail="create table tbControl_Detail(id_control int ,pes_act double,tal_act double,fec_control text );";

        String tbInmunizaciones="create table tbInmunizacion(id_inmu INTEGER primary key AUTOINCREMENT," +
                "dni_apod text, dni_cui text,des_inmu text,cant_dosis    int );";

        String tbTamizaje="create table tbTamizaje(id_tamiza INTEGER primary key, dni_apod text, dni_cui text," +
                "fec_prueba text, cant_hem int);";

        db.execSQL(tbJobs);
        db.execSQL(tbApoderado);
        db.execSQL(tbNiño);
        db.execSQL(tbDieta);
        db.execSQL(tbDieta_Detail);
        db.execSQL(tbControl);
        db.execSQL(tbControl_Detail);
        db.execSQL(tbInmunizaciones);
        db.execSQL(tbTamizaje);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
