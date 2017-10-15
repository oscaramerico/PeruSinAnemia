package com.example.lenovo.perusinanemia.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.asus.myapplication.beans.DietaBean;
import com.example.asus.myapplication.connection.Myconnection;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public class DietaDAOSqLite implements DietaDAO {
    @Override
    public void insertDieta(Context context, DietaBean dietaBean) {
        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);
        SQLiteDatabase database=connection.getWritableDatabase();//por vamos a insertar
        String query="insert into tbDieta values(?,?,?,?);";
        database.execSQL(query,new Object[]{
                dietaBean.getId_dieta(),
                dietaBean.getAlimento(),
                dietaBean.getFrecuencia(),
                dietaBean.getCant_sug()
        });
    }

    @Override
    public ArrayList<DietaBean> getAllDieta(Context context) {

        ArrayList<DietaBean> data=new ArrayList<>();
        DietaBean dietaBean=null;

        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);

        SQLiteDatabase database=connection.getReadableDatabase();//por vamos a insertar
        String query="Select * from tbDieta ";
        Cursor cursor=database.rawQuery(query,null);//pide 2 parametros , el 2do es pra poner otras condiciones
        while (cursor.moveToNext()){
            dietaBean=new DietaBean(
                    cursor.getInt(cursor.getColumnIndex("id_dieta")),
                    cursor.getString(cursor.getColumnIndex("alimento")),
                    cursor.getString(cursor.getColumnIndex("frecuencia")),
                    cursor.getInt(cursor.getColumnIndex("cant_sug"))

            );
            data.add(dietaBean);
        }

        return  data;
    }
}
