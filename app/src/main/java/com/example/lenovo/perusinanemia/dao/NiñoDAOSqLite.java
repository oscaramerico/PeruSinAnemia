package com.example.lenovo.perusinanemia.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.asus.myapplication.beans.NiñoBean;
import com.example.asus.myapplication.connection.Myconnection;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public class NiñoDAOSqLite implements NiñoDAO {
    @Override
    public void insertNiño(Context context, NiñoBean niñoBean) {
        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);
        SQLiteDatabase database=connection.getWritableDatabase();//por vamos a insertar
        String query="insert into tbNiño values(?,?,?,?,?,?,?,?,?,?);";
        database.execSQL(query,new Object[]{
                niñoBean.getDni_cui(),
                niñoBean.getDni_apod(),
                niñoBean.getApellido(),
                niñoBean.getNombre(),
                niñoBean.getSexo(),
                niñoBean.getEdad(),
                niñoBean.getF_nac(),
                niñoBean.getLug_nac(),
                niñoBean.getDomi(),
                niñoBean.getGrup_sang()
        });
    }

    @Override
    public ArrayList<NiñoBean> getAllNiño(Context context) {

        ArrayList<NiñoBean> data=new ArrayList<>();
        NiñoBean niñoBean=null;

        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);

        SQLiteDatabase database=connection.getReadableDatabase();//por vamos a insertar
        String query="Select * from tbNiño ";
        Cursor cursor=database.rawQuery(query,null);//pide 2 parametros , el 2do es pra poner otras condiciones
        while (cursor.moveToNext()){
            niñoBean=new NiñoBean(
                    cursor.getString(cursor.getColumnIndex("dni_cui")),
                    cursor.getString(cursor.getColumnIndex("dni_apod")),
                    cursor.getString(cursor.getColumnIndex("apellido")),
                    cursor.getString(cursor.getColumnIndex("nombre")),
                    cursor.getString(cursor.getColumnIndex("sexo")),
                    cursor.getInt(cursor.getColumnIndex("edad")),
                    cursor.getString(cursor.getColumnIndex("f_nac")),
                    cursor.getString(cursor.getColumnIndex("lug_nac")),
                    cursor.getString(cursor.getColumnIndex("domi")),
                    cursor.getString(cursor.getColumnIndex("grup_sang"))

            );
            data.add(niñoBean);
        }

        return  data;
    }
}
