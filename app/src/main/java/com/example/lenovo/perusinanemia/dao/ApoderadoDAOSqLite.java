package com.example.lenovo.perusinanemia.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.asus.myapplication.beans.ApoderadoBean;
import com.example.asus.myapplication.connection.Myconnection;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public class ApoderadoDAOSqLite implements ApoderadoDAO {
    @Override
    public void insertApoderado(Context context, ApoderadoBean apoderadoBean) {
        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);
        SQLiteDatabase database=connection.getWritableDatabase();//por vamos a insertar
        String query="insert into tbApoderado values(?,?,?,?,?,?,?,?,?,?);";
        database.execSQL(query,new Object[]{
                apoderadoBean.getDni_apod(),
                apoderadoBean.getApellido(),
                apoderadoBean.getNombre(),
                apoderadoBean.getEdad(),
                apoderadoBean.getGra_instr(),
                apoderadoBean.getOcupacion(),
                apoderadoBean.getEst_civil(),
                apoderadoBean.getTelefono(),
                apoderadoBean.getDni_jobs(),
                apoderadoBean.getTipo()
        });

    }

    @Override
    public ArrayList<ApoderadoBean> getAllApoderado(Context context) {

        ArrayList<ApoderadoBean> data=new ArrayList<>();
        ApoderadoBean apoderadoBean=null;

        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);

        SQLiteDatabase database=connection.getReadableDatabase();//por vamos a insertar
        String query="Select * from tbApoderado ";
        Cursor cursor=database.rawQuery(query,null);//pide 2 parametros , el 2do es pra poner otras condiciones
        while (cursor.moveToNext()){
            apoderadoBean=new ApoderadoBean(
                    cursor.getString(cursor.getColumnIndex("dni_apod")),
                    cursor.getString(cursor.getColumnIndex("apellido")),
                    cursor.getString(cursor.getColumnIndex("nombre")),
                    cursor.getInt(cursor.getColumnIndex("edad")),
                    cursor.getString(cursor.getColumnIndex("gra_instr")),
                    cursor.getString(cursor.getColumnIndex("ocupacion")),
                    cursor.getString(cursor.getColumnIndex("est_civil")),
                    cursor.getString(cursor.getColumnIndex("telefono")),
                    cursor.getString(cursor.getColumnIndex("dni_jobs")),
                    cursor.getString(cursor.getColumnIndex("tipo"))

            );
            data.add(apoderadoBean);
        }

        return  data;
    }
}
