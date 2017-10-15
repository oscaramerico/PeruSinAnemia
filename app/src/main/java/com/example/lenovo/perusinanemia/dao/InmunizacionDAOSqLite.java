package com.example.lenovo.perusinanemia.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.asus.myapplication.beans.InmunizacionesBean;
import com.example.asus.myapplication.connection.Myconnection;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public class InmunizacionDAOSqLite implements InmunizacionesDAO {
    @Override
    public void insertInmunizacion(Context context, InmunizacionesBean inmunizacionesBean) {
        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);
        SQLiteDatabase database=connection.getWritableDatabase();//por vamos a insertar
        String query="insert into tbInmunizaciones values(?,?,?,?,?);";
        database.execSQL(query,new Object[]{
                inmunizacionesBean.getId_inmu(),
                inmunizacionesBean.getDni_apod(),
                inmunizacionesBean.getDni_cui(),
                inmunizacionesBean.getDes_inmu(),
                inmunizacionesBean.getCant_dosis()
        });
    }

    @Override
    public ArrayList<InmunizacionesBean> getAllInmunizacion(Context context) {
        ArrayList<InmunizacionesBean> data=new ArrayList<>();
        InmunizacionesBean apoderadoBean=null;

        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);

        SQLiteDatabase database=connection.getReadableDatabase();//por vamos a insertar
        String query="Select * from tbInmunizaciones ";
        Cursor cursor=database.rawQuery(query,null);//pide 2 parametros , el 2do es pra poner otras condiciones
        while (cursor.moveToNext()){
            apoderadoBean=new InmunizacionesBean(
                    cursor.getInt(cursor.getColumnIndex("id_inmu")),
                    cursor.getString(cursor.getColumnIndex("dni_apod")),
                    cursor.getString(cursor.getColumnIndex("dni_cui")),
                    cursor.getString(cursor.getColumnIndex("des_inmu")),
                    cursor.getInt(cursor.getColumnIndex("cant_dosis"))

            );
            data.add(apoderadoBean);
        }

        return  data;
    }
}
