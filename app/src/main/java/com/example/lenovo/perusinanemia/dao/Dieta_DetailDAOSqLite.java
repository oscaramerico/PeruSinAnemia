package com.example.lenovo.perusinanemia.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.asus.myapplication.beans.Dieta_DetailBean;
import com.example.asus.myapplication.connection.Myconnection;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public class Dieta_DetailDAOSqLite implements Dieta_DetailDAO {
    @Override
    public void insertDietDetail(Context context, Dieta_DetailBean dieta_detailBean) {
        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);
        SQLiteDatabase database=connection.getWritableDatabase();//por vamos a insertar
        String query="insert into tbDieta_Detail values(?,?,?);";
        database.execSQL(query,new Object[]{
                dieta_detailBean.getId_dieta(),
                dieta_detailBean.getDni_apod(),
                dieta_detailBean.getDni_cui()
        });
    }

    @Override
    public ArrayList<Dieta_DetailBean> getAllDietaDetail(Context context) {

        ArrayList<Dieta_DetailBean> data=new ArrayList<>();
        Dieta_DetailBean dieta_detailBean=null;

        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);

        SQLiteDatabase database=connection.getReadableDatabase();//por vamos a insertar
        String query="Select * from tbDieta_Detail ";
        Cursor cursor=database.rawQuery(query,null);//pide 2 parametros , el 2do es pra poner otras condiciones
        while (cursor.moveToNext()){
            dieta_detailBean=new Dieta_DetailBean(
                    cursor.getInt(cursor.getColumnIndex("id_dieta")),
                    cursor.getString(cursor.getColumnIndex("dni_apod")),
                    cursor.getString(cursor.getColumnIndex("dni_cui"))


            );
            data.add(dieta_detailBean);
        }

        return  data;
    }
}
