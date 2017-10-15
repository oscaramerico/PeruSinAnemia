package com.example.lenovo.perusinanemia.dao;

import android.content.Context;

import com.example.asus.myapplication.beans.TamizajeBean;

import java.util.ArrayList;

/**
 * Created by ASUS on 14/10/2017.
 */

public interface TamizajeDAO {

    public void insertTamizaje(Context context, TamizajeBean tamizajeBean) ;
    public ArrayList<TamizajeBean> getAllTamizaje(Context context);
}
