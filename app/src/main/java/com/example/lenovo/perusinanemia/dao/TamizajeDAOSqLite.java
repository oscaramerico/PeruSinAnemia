package com.example.lenovo.perusinanemia.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.asus.myapplication.beans.TamizajeBean;
import com.example.asus.myapplication.connection.Myconnection;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public class TamizajeDAOSqLite implements TamizajeDAO {
    @Override
    public void insertTamizaje(Context context, TamizajeBean tamizajeBean) {

        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);
        SQLiteDatabase database=connection.getWritableDatabase();//por vamos a insertar
        String query="insert into tbTamizaje values(?,?,?,?,?);";
        database.execSQL(query,new Object[]{
                tamizajeBean.getId_tamiza(),
                tamizajeBean.getDni_apod(),
                tamizajeBean.getDni_cui(),
                tamizajeBean.getFec_prueba(),
                tamizajeBean.getCant_hem()
        });
    }

    @Override
    public ArrayList<TamizajeBean> getAllTamizaje(Context context) {

        ArrayList<TamizajeBean> data=new ArrayList<>();
        TamizajeBean tamizajeBean=null;

        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);

        SQLiteDatabase database=connection.getReadableDatabase();//por vamos a insertar
        String query="Select * from tbApoderado ";
        Cursor cursor=database.rawQuery(query,null);//pide 2 parametros , el 2do es pra poner otras condiciones
        while (cursor.moveToNext()){
            tamizajeBean=new TamizajeBean(
                    cursor.getInt(cursor.getColumnIndex("id_tamiza")),
                    cursor.getString(cursor.getColumnIndex("dni_apod")),
                    cursor.getString(cursor.getColumnIndex("dni_cui")),
                    cursor.getString(cursor.getColumnIndex("fec_prueba")),
                    cursor.getInt(cursor.getColumnIndex("cant_hem"))

            );
            data.add(tamizajeBean);
        }

        return  data;
    }
}
