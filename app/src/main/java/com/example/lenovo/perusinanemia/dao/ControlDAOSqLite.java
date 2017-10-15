package com.example.lenovo.perusinanemia.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.asus.myapplication.beans.ControlBean;
import com.example.asus.myapplication.connection.Myconnection;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public class ControlDAOSqLite implements ControlDAO {
    @Override
    public void insertControl(Context context, ControlBean controlBean) {
        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);
        SQLiteDatabase database=connection.getWritableDatabase();//por vamos a insertar
        String query="insert into tbControl values(?,?,?,?,?);";
        database.execSQL(query,new Object[]{
                controlBean.getId_control(),
                controlBean.getDni_apod(),
                controlBean.getDni_cui(),
                controlBean.getCriterio_control(),
                controlBean.getCant_controles()
        });

    }

    @Override
    public ArrayList<ControlBean> getAllControl(Context context) {

        ArrayList<ControlBean> data=new ArrayList<>();
        ControlBean controlBean=null;

        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);

        SQLiteDatabase database=connection.getReadableDatabase();//por vamos a insertar
        String query="Select * from tbControl ";
        Cursor cursor=database.rawQuery(query,null);//pide 2 parametros , el 2do es pra poner otras condiciones
        while (cursor.moveToNext()){
            controlBean=new ControlBean(
                    cursor.getInt(cursor.getColumnIndex("id_control")),
                    cursor.getString(cursor.getColumnIndex("dni_apod")),
                    cursor.getString(cursor.getColumnIndex("dni_cui")),
                    cursor.getString(cursor.getColumnIndex("criterio_control")),
                    cursor.getInt(cursor.getColumnIndex("cant_controles"))

            );
            data.add(controlBean);
        }

        return  data;
    }
}
