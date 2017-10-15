package com.example.lenovo.perusinanemia.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.asus.myapplication.beans.Control_DetailBean;
import com.example.asus.myapplication.connection.Myconnection;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public class Control_DetailDAOSqLite implements Control_DetailDAO {
    @Override
    public void insertControlDetail(Context context, Control_DetailBean control_detailBean) {
        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);
        SQLiteDatabase database=connection.getWritableDatabase();//por vamos a insertar
        String query="insert into tbControl_Detail values(?,?,?,?);";
        database.execSQL(query,new Object[]{
                control_detailBean.getId_control(),
                control_detailBean.getPes_act(),
                control_detailBean.getTal_act(),
                control_detailBean.getFec_control()
        });

    }

    @Override
    public ArrayList<Control_DetailBean> getAllControlDetail(Context context) {

        ArrayList<Control_DetailBean> data=new ArrayList<>();
        Control_DetailBean control_detailBean=null;

        Myconnection connection=new Myconnection(context,Myconnection.dbName,null,1);

        SQLiteDatabase database=connection.getReadableDatabase();//por vamos a insertar
        String query="Select * from tbControl_Detail ";
        Cursor cursor=database.rawQuery(query,null);//pide 2 parametros , el 2do es pra poner otras condiciones
        while (cursor.moveToNext()){
            control_detailBean=new Control_DetailBean(
                    cursor.getInt(cursor.getColumnIndex("id_control")),
                    cursor.getDouble(cursor.getColumnIndex("pes_act")),
                    cursor.getDouble(cursor.getColumnIndex("tal_act")),
                    cursor.getString(cursor.getColumnIndex("fec_control"))


            );
            data.add(control_detailBean);
        }

        return  data;
    }
}
