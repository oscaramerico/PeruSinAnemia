package com.example.lenovo.perusinanemia.dao;

import android.content.Context;

import com.example.asus.myapplication.beans.InmunizacionesBean;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public interface InmunizacionesDAO {

    public void insertInmunizacion(Context context, InmunizacionesBean inmunizacionesBean) ;
    public ArrayList<InmunizacionesBean> getAllInmunizacion(Context context);
}
