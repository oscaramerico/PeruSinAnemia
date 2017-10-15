package com.example.lenovo.perusinanemia.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.asus.myapplication.beans.JobBean;
import com.example.asus.myapplication.connection.Myconnection;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public class JobDAOSqLite implements JobDAO {
    @Override
    public void insertJob(Context context, JobBean jobBean) {
        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);
        SQLiteDatabase database=connection.getWritableDatabase();//por vamos a insertar
        String query="insert into tbJobs values(?,?,?,?,?,?);";
        database.execSQL(query,new Object[]{
                jobBean.getDni_jobs(),
                jobBean.getApellido(),
                jobBean.getNombre(),
                jobBean.getCargo(),
                jobBean.getCod_colegiatura(),
                jobBean.getCentro_salud()
        });
    }

    @Override
    public ArrayList<JobBean> getAllJob(Context context) {

        ArrayList<JobBean> data=new ArrayList<>();
        JobBean jobBean=null;

        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);

        SQLiteDatabase database=connection.getReadableDatabase();//por vamos a insertar
        String query="Select * from tbJobs ";
        Cursor cursor=database.rawQuery(query,null);//pide 2 parametros , el 2do es pra poner otras condiciones
        while (cursor.moveToNext()){
            jobBean=new JobBean(
                    cursor.getString(cursor.getColumnIndex("dni_jobs")),
                    cursor.getString(cursor.getColumnIndex("apellido")),
                    cursor.getString(cursor.getColumnIndex("nombre")),
                    cursor.getString(cursor.getColumnIndex("cargo")),
                    cursor.getString(cursor.getColumnIndex("cod_colegiatura")),
                    cursor.getString(cursor.getColumnIndex("centro_salud"))

            );
            data.add(jobBean);
        }

        return  data;
    }
}
